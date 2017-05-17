package com.laidu.bishe.backstage.mapper;

import com.laidu.bishe.backstage.domain.SeqInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface SeqInfoMapper {
    @Delete({
        "delete from seq_info",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into seq_info (id, teacher_id, ",
        "course_id, seq, start_time)",
        "values (#{id,jdbcType=BIGINT}, #{teacherId,jdbcType=BIGINT}, ",
        "#{courseId,jdbcType=BIGINT}, #{seq,jdbcType=BIGINT}, #{startTime,jdbcType=TIMESTAMP})"
    })
    int insert(SeqInfo record);

    @InsertProvider(type=SeqInfoSqlProvider.class, method="insertSelective")
    int insertSelective(SeqInfo record);

    @Select({
        "select",
        "id, teacher_id, course_id, seq, start_time",
        "from seq_info",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="teacher_id", property="teacherId", jdbcType=JdbcType.BIGINT),
        @Result(column="course_id", property="courseId", jdbcType=JdbcType.BIGINT),
        @Result(column="seq", property="seq", jdbcType=JdbcType.BIGINT),
        @Result(column="start_time", property="startTime", jdbcType=JdbcType.TIMESTAMP)
    })
    SeqInfo selectByPrimaryKey(Long id);

    @UpdateProvider(type=SeqInfoSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SeqInfo record);

    @Update({
        "update seq_info",
        "set teacher_id = #{teacherId,jdbcType=BIGINT},",
          "course_id = #{courseId,jdbcType=BIGINT},",
          "seq = #{seq,jdbcType=BIGINT},",
          "start_time = #{startTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(SeqInfo record);
}