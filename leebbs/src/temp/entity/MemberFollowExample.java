package temp.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberFollowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberFollowExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateIsNull() {
            addCriterion("modify_date is null");
            return (Criteria) this;
        }

        public Criteria andModifyDateIsNotNull() {
            addCriterion("modify_date is not null");
            return (Criteria) this;
        }

        public Criteria andModifyDateEqualTo(Date value) {
            addCriterion("modify_date =", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotEqualTo(Date value) {
            addCriterion("modify_date <>", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThan(Date value) {
            addCriterion("modify_date >", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_date >=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThan(Date value) {
            addCriterion("modify_date <", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThanOrEqualTo(Date value) {
            addCriterion("modify_date <=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateIn(List<Date> values) {
            addCriterion("modify_date in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotIn(List<Date> values) {
            addCriterion("modify_date not in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateBetween(Date value1, Date value2) {
            addCriterion("modify_date between", value1, value2, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotBetween(Date value1, Date value2) {
            addCriterion("modify_date not between", value1, value2, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andFollowerMemberIdIsNull() {
            addCriterion("follower_member_id is null");
            return (Criteria) this;
        }

        public Criteria andFollowerMemberIdIsNotNull() {
            addCriterion("follower_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andFollowerMemberIdEqualTo(String value) {
            addCriterion("follower_member_id =", value, "followerMemberId");
            return (Criteria) this;
        }

        public Criteria andFollowerMemberIdNotEqualTo(String value) {
            addCriterion("follower_member_id <>", value, "followerMemberId");
            return (Criteria) this;
        }

        public Criteria andFollowerMemberIdGreaterThan(String value) {
            addCriterion("follower_member_id >", value, "followerMemberId");
            return (Criteria) this;
        }

        public Criteria andFollowerMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("follower_member_id >=", value, "followerMemberId");
            return (Criteria) this;
        }

        public Criteria andFollowerMemberIdLessThan(String value) {
            addCriterion("follower_member_id <", value, "followerMemberId");
            return (Criteria) this;
        }

        public Criteria andFollowerMemberIdLessThanOrEqualTo(String value) {
            addCriterion("follower_member_id <=", value, "followerMemberId");
            return (Criteria) this;
        }

        public Criteria andFollowerMemberIdLike(String value) {
            addCriterion("follower_member_id like", value, "followerMemberId");
            return (Criteria) this;
        }

        public Criteria andFollowerMemberIdNotLike(String value) {
            addCriterion("follower_member_id not like", value, "followerMemberId");
            return (Criteria) this;
        }

        public Criteria andFollowerMemberIdIn(List<String> values) {
            addCriterion("follower_member_id in", values, "followerMemberId");
            return (Criteria) this;
        }

        public Criteria andFollowerMemberIdNotIn(List<String> values) {
            addCriterion("follower_member_id not in", values, "followerMemberId");
            return (Criteria) this;
        }

        public Criteria andFollowerMemberIdBetween(String value1, String value2) {
            addCriterion("follower_member_id between", value1, value2, "followerMemberId");
            return (Criteria) this;
        }

        public Criteria andFollowerMemberIdNotBetween(String value1, String value2) {
            addCriterion("follower_member_id not between", value1, value2, "followerMemberId");
            return (Criteria) this;
        }

        public Criteria andFollowedMemberIdIsNull() {
            addCriterion("followed_member_id is null");
            return (Criteria) this;
        }

        public Criteria andFollowedMemberIdIsNotNull() {
            addCriterion("followed_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andFollowedMemberIdEqualTo(String value) {
            addCriterion("followed_member_id =", value, "followedMemberId");
            return (Criteria) this;
        }

        public Criteria andFollowedMemberIdNotEqualTo(String value) {
            addCriterion("followed_member_id <>", value, "followedMemberId");
            return (Criteria) this;
        }

        public Criteria andFollowedMemberIdGreaterThan(String value) {
            addCriterion("followed_member_id >", value, "followedMemberId");
            return (Criteria) this;
        }

        public Criteria andFollowedMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("followed_member_id >=", value, "followedMemberId");
            return (Criteria) this;
        }

        public Criteria andFollowedMemberIdLessThan(String value) {
            addCriterion("followed_member_id <", value, "followedMemberId");
            return (Criteria) this;
        }

        public Criteria andFollowedMemberIdLessThanOrEqualTo(String value) {
            addCriterion("followed_member_id <=", value, "followedMemberId");
            return (Criteria) this;
        }

        public Criteria andFollowedMemberIdLike(String value) {
            addCriterion("followed_member_id like", value, "followedMemberId");
            return (Criteria) this;
        }

        public Criteria andFollowedMemberIdNotLike(String value) {
            addCriterion("followed_member_id not like", value, "followedMemberId");
            return (Criteria) this;
        }

        public Criteria andFollowedMemberIdIn(List<String> values) {
            addCriterion("followed_member_id in", values, "followedMemberId");
            return (Criteria) this;
        }

        public Criteria andFollowedMemberIdNotIn(List<String> values) {
            addCriterion("followed_member_id not in", values, "followedMemberId");
            return (Criteria) this;
        }

        public Criteria andFollowedMemberIdBetween(String value1, String value2) {
            addCriterion("followed_member_id between", value1, value2, "followedMemberId");
            return (Criteria) this;
        }

        public Criteria andFollowedMemberIdNotBetween(String value1, String value2) {
            addCriterion("followed_member_id not between", value1, value2, "followedMemberId");
            return (Criteria) this;
        }

        public Criteria andFollowedMemberNameIsNull() {
            addCriterion("followed_member_name is null");
            return (Criteria) this;
        }

        public Criteria andFollowedMemberNameIsNotNull() {
            addCriterion("followed_member_name is not null");
            return (Criteria) this;
        }

        public Criteria andFollowedMemberNameEqualTo(String value) {
            addCriterion("followed_member_name =", value, "followedMemberName");
            return (Criteria) this;
        }

        public Criteria andFollowedMemberNameNotEqualTo(String value) {
            addCriterion("followed_member_name <>", value, "followedMemberName");
            return (Criteria) this;
        }

        public Criteria andFollowedMemberNameGreaterThan(String value) {
            addCriterion("followed_member_name >", value, "followedMemberName");
            return (Criteria) this;
        }

        public Criteria andFollowedMemberNameGreaterThanOrEqualTo(String value) {
            addCriterion("followed_member_name >=", value, "followedMemberName");
            return (Criteria) this;
        }

        public Criteria andFollowedMemberNameLessThan(String value) {
            addCriterion("followed_member_name <", value, "followedMemberName");
            return (Criteria) this;
        }

        public Criteria andFollowedMemberNameLessThanOrEqualTo(String value) {
            addCriterion("followed_member_name <=", value, "followedMemberName");
            return (Criteria) this;
        }

        public Criteria andFollowedMemberNameLike(String value) {
            addCriterion("followed_member_name like", value, "followedMemberName");
            return (Criteria) this;
        }

        public Criteria andFollowedMemberNameNotLike(String value) {
            addCriterion("followed_member_name not like", value, "followedMemberName");
            return (Criteria) this;
        }

        public Criteria andFollowedMemberNameIn(List<String> values) {
            addCriterion("followed_member_name in", values, "followedMemberName");
            return (Criteria) this;
        }

        public Criteria andFollowedMemberNameNotIn(List<String> values) {
            addCriterion("followed_member_name not in", values, "followedMemberName");
            return (Criteria) this;
        }

        public Criteria andFollowedMemberNameBetween(String value1, String value2) {
            addCriterion("followed_member_name between", value1, value2, "followedMemberName");
            return (Criteria) this;
        }

        public Criteria andFollowedMemberNameNotBetween(String value1, String value2) {
            addCriterion("followed_member_name not between", value1, value2, "followedMemberName");
            return (Criteria) this;
        }

        public Criteria andFollowedMemberIconIsNull() {
            addCriterion("followed_member_icon is null");
            return (Criteria) this;
        }

        public Criteria andFollowedMemberIconIsNotNull() {
            addCriterion("followed_member_icon is not null");
            return (Criteria) this;
        }

        public Criteria andFollowedMemberIconEqualTo(String value) {
            addCriterion("followed_member_icon =", value, "followedMemberIcon");
            return (Criteria) this;
        }

        public Criteria andFollowedMemberIconNotEqualTo(String value) {
            addCriterion("followed_member_icon <>", value, "followedMemberIcon");
            return (Criteria) this;
        }

        public Criteria andFollowedMemberIconGreaterThan(String value) {
            addCriterion("followed_member_icon >", value, "followedMemberIcon");
            return (Criteria) this;
        }

        public Criteria andFollowedMemberIconGreaterThanOrEqualTo(String value) {
            addCriterion("followed_member_icon >=", value, "followedMemberIcon");
            return (Criteria) this;
        }

        public Criteria andFollowedMemberIconLessThan(String value) {
            addCriterion("followed_member_icon <", value, "followedMemberIcon");
            return (Criteria) this;
        }

        public Criteria andFollowedMemberIconLessThanOrEqualTo(String value) {
            addCriterion("followed_member_icon <=", value, "followedMemberIcon");
            return (Criteria) this;
        }

        public Criteria andFollowedMemberIconLike(String value) {
            addCriterion("followed_member_icon like", value, "followedMemberIcon");
            return (Criteria) this;
        }

        public Criteria andFollowedMemberIconNotLike(String value) {
            addCriterion("followed_member_icon not like", value, "followedMemberIcon");
            return (Criteria) this;
        }

        public Criteria andFollowedMemberIconIn(List<String> values) {
            addCriterion("followed_member_icon in", values, "followedMemberIcon");
            return (Criteria) this;
        }

        public Criteria andFollowedMemberIconNotIn(List<String> values) {
            addCriterion("followed_member_icon not in", values, "followedMemberIcon");
            return (Criteria) this;
        }

        public Criteria andFollowedMemberIconBetween(String value1, String value2) {
            addCriterion("followed_member_icon between", value1, value2, "followedMemberIcon");
            return (Criteria) this;
        }

        public Criteria andFollowedMemberIconNotBetween(String value1, String value2) {
            addCriterion("followed_member_icon not between", value1, value2, "followedMemberIcon");
            return (Criteria) this;
        }

        public Criteria andFollowStatusIsNull() {
            addCriterion("follow_status is null");
            return (Criteria) this;
        }

        public Criteria andFollowStatusIsNotNull() {
            addCriterion("follow_status is not null");
            return (Criteria) this;
        }

        public Criteria andFollowStatusEqualTo(Integer value) {
            addCriterion("follow_status =", value, "followStatus");
            return (Criteria) this;
        }

        public Criteria andFollowStatusNotEqualTo(Integer value) {
            addCriterion("follow_status <>", value, "followStatus");
            return (Criteria) this;
        }

        public Criteria andFollowStatusGreaterThan(Integer value) {
            addCriterion("follow_status >", value, "followStatus");
            return (Criteria) this;
        }

        public Criteria andFollowStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("follow_status >=", value, "followStatus");
            return (Criteria) this;
        }

        public Criteria andFollowStatusLessThan(Integer value) {
            addCriterion("follow_status <", value, "followStatus");
            return (Criteria) this;
        }

        public Criteria andFollowStatusLessThanOrEqualTo(Integer value) {
            addCriterion("follow_status <=", value, "followStatus");
            return (Criteria) this;
        }

        public Criteria andFollowStatusIn(List<Integer> values) {
            addCriterion("follow_status in", values, "followStatus");
            return (Criteria) this;
        }

        public Criteria andFollowStatusNotIn(List<Integer> values) {
            addCriterion("follow_status not in", values, "followStatus");
            return (Criteria) this;
        }

        public Criteria andFollowStatusBetween(Integer value1, Integer value2) {
            addCriterion("follow_status between", value1, value2, "followStatus");
            return (Criteria) this;
        }

        public Criteria andFollowStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("follow_status not between", value1, value2, "followStatus");
            return (Criteria) this;
        }

        public Criteria andFollowTypeIsNull() {
            addCriterion("follow_type is null");
            return (Criteria) this;
        }

        public Criteria andFollowTypeIsNotNull() {
            addCriterion("follow_type is not null");
            return (Criteria) this;
        }

        public Criteria andFollowTypeEqualTo(Integer value) {
            addCriterion("follow_type =", value, "followType");
            return (Criteria) this;
        }

        public Criteria andFollowTypeNotEqualTo(Integer value) {
            addCriterion("follow_type <>", value, "followType");
            return (Criteria) this;
        }

        public Criteria andFollowTypeGreaterThan(Integer value) {
            addCriterion("follow_type >", value, "followType");
            return (Criteria) this;
        }

        public Criteria andFollowTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("follow_type >=", value, "followType");
            return (Criteria) this;
        }

        public Criteria andFollowTypeLessThan(Integer value) {
            addCriterion("follow_type <", value, "followType");
            return (Criteria) this;
        }

        public Criteria andFollowTypeLessThanOrEqualTo(Integer value) {
            addCriterion("follow_type <=", value, "followType");
            return (Criteria) this;
        }

        public Criteria andFollowTypeIn(List<Integer> values) {
            addCriterion("follow_type in", values, "followType");
            return (Criteria) this;
        }

        public Criteria andFollowTypeNotIn(List<Integer> values) {
            addCriterion("follow_type not in", values, "followType");
            return (Criteria) this;
        }

        public Criteria andFollowTypeBetween(Integer value1, Integer value2) {
            addCriterion("follow_type between", value1, value2, "followType");
            return (Criteria) this;
        }

        public Criteria andFollowTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("follow_type not between", value1, value2, "followType");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}