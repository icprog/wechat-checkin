package com.laidu.bishe.backstage.mapper;

import com.laidu.bishe.backstage.domain.CheckinDetailInfo;
import org.apache.ibatis.jdbc.SQL;

public class CheckinDetailInfoSqlProvider {

    public String insertSelective(CheckinDetailInfo record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("checkin_detail_info");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getStuId() != null) {
            sql.VALUES("stu_id", "#{stuId,jdbcType=BIGINT}");
        }
        
        if (record.getCheckinTime() != null) {
            sql.VALUES("checkin_time", "#{checkinTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getProofPath() != null) {
            sql.VALUES("proof_path", "#{proofPath,jdbcType=VARCHAR}");
        }
        
        if (record.getCheckinType() != null) {
            sql.VALUES("checkin_type", "#{checkinType,jdbcType=SMALLINT}");
        }
        
        if (record.getIsSucc() != null) {
            sql.VALUES("is_succ", "#{isSucc,jdbcType=BIT}");
        }
        
        if (record.getCheckinResult() != null) {
            sql.VALUES("checkin_result", "#{checkinResult,jdbcType=SMALLINT}");
        }
        
        if (record.getCourseId() != null) {
            sql.VALUES("course_id", "#{courseId,jdbcType=BIGINT}");
        }
        
        if (record.getSeqId() != null) {
            sql.VALUES("seq_id", "#{seqId,jdbcType=BIGINT}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(CheckinDetailInfo record) {
        SQL sql = new SQL();
        sql.UPDATE("checkin_detail_info");
        
        if (record.getStuId() != null) {
            sql.SET("stu_id = #{stuId,jdbcType=BIGINT}");
        }
        
        if (record.getCheckinTime() != null) {
            sql.SET("checkin_time = #{checkinTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getProofPath() != null) {
            sql.SET("proof_path = #{proofPath,jdbcType=VARCHAR}");
        }
        
        if (record.getCheckinType() != null) {
            sql.SET("checkin_type = #{checkinType,jdbcType=SMALLINT}");
        }
        
        if (record.getIsSucc() != null) {
            sql.SET("is_succ = #{isSucc,jdbcType=BIT}");
        }
        
        if (record.getCheckinResult() != null) {
            sql.SET("checkin_result = #{checkinResult,jdbcType=SMALLINT}");
        }
        
        if (record.getCourseId() != null) {
            sql.SET("course_id = #{courseId,jdbcType=BIGINT}");
        }
        
        if (record.getSeqId() != null) {
            sql.SET("seq_id = #{seqId,jdbcType=BIGINT}");
        }
        
        sql.WHERE("id = #{id,jdbcType=BIGINT}");
        
        return sql.toString();
    }
}