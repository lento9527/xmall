package com.none.xmall.db.model;

import java.io.Serializable;
import java.util.Date;

public class CmsSubject implements Serializable {
    private Long id;

    /**
     * 专题分类id
     *
     * @mbggenerated
     */
    private Long categoryId;

    /**
     * 专题分类名称
     *
     * @mbggenerated
     */
    private String categoryName;

    /**
     * 专题名称
     *
     * @mbggenerated
     */
    private String title;

    /**
     * 专题主图
     *
     * @mbggenerated
     */
    private String pic;

    /**
     * 专题描述
     *
     * @mbggenerated
     */
    private String description;

    /**
     * 关联产品数量
     *
     * @mbggenerated
     */
    private Integer productCount;

    /**
     * 画册图片用逗号分割
     *
     * @mbggenerated
     */
    private String albumPics;

    /**
     * 推荐状态
     *
     * @mbggenerated
     */
    private Integer recommendStatus;

    /**
     * 收藏次数
     *
     * @mbggenerated
     */
    private Integer collectCount;

    /**
     * 浏览次数
     *
     * @mbggenerated
     */
    private Integer readCount;

    /**
     * 评论次数
     *
     * @mbggenerated
     */
    private Integer commentCount;

    /**
     * 转发数
     *
     * @mbggenerated
     */
    private Integer forwardCount;

    /**
     * 创建时间
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * 显示状态：0->不显示；1->显示
     *
     * @mbggenerated
     */
    private Integer showStatus;

    /**
     * 专题详情
     *
     * @mbggenerated
     */
    private String content;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    public String getAlbumPics() {
        return albumPics;
    }

    public void setAlbumPics(String albumPics) {
        this.albumPics = albumPics;
    }

    public Integer getRecommendStatus() {
        return recommendStatus;
    }

    public void setRecommendStatus(Integer recommendStatus) {
        this.recommendStatus = recommendStatus;
    }

    public Integer getCollectCount() {
        return collectCount;
    }

    public void setCollectCount(Integer collectCount) {
        this.collectCount = collectCount;
    }

    public Integer getReadCount() {
        return readCount;
    }

    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Integer getForwardCount() {
        return forwardCount;
    }

    public void setForwardCount(Integer forwardCount) {
        this.forwardCount = forwardCount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", categoryName=").append(categoryName);
        sb.append(", title=").append(title);
        sb.append(", pic=").append(pic);
        sb.append(", description=").append(description);
        sb.append(", productCount=").append(productCount);
        sb.append(", albumPics=").append(albumPics);
        sb.append(", recommendStatus=").append(recommendStatus);
        sb.append(", collectCount=").append(collectCount);
        sb.append(", readCount=").append(readCount);
        sb.append(", commentCount=").append(commentCount);
        sb.append(", forwardCount=").append(forwardCount);
        sb.append(", createTime=").append(createTime);
        sb.append(", showStatus=").append(showStatus);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}