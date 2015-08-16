package com.leebbs.bbs.entity;

import java.util.Date;

public class MemberFollow {
    private String id;

    private Date createDate;

    private Date modifyDate;

    private String followerMemberId;

    private String followedMemberId;

    private String followedMemberName;

    private String followedMemberIcon;

    private Integer followStatus;

    private Integer followType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getFollowerMemberId() {
        return followerMemberId;
    }

    public void setFollowerMemberId(String followerMemberId) {
        this.followerMemberId = followerMemberId == null ? null : followerMemberId.trim();
    }

    public String getFollowedMemberId() {
        return followedMemberId;
    }

    public void setFollowedMemberId(String followedMemberId) {
        this.followedMemberId = followedMemberId == null ? null : followedMemberId.trim();
    }

    public String getFollowedMemberName() {
        return followedMemberName;
    }

    public void setFollowedMemberName(String followedMemberName) {
        this.followedMemberName = followedMemberName == null ? null : followedMemberName.trim();
    }

    public String getFollowedMemberIcon() {
        return followedMemberIcon;
    }

    public void setFollowedMemberIcon(String followedMemberIcon) {
        this.followedMemberIcon = followedMemberIcon == null ? null : followedMemberIcon.trim();
    }

    public Integer getFollowStatus() {
        return followStatus;
    }

    public void setFollowStatus(Integer followStatus) {
        this.followStatus = followStatus;
    }

    public Integer getFollowType() {
        return followType;
    }

    public void setFollowType(Integer followType) {
        this.followType = followType;
    }
}