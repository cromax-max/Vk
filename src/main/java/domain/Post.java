package domain;

public class Post {

    private String id;
    private String title;
    private String data;
    private String text;
    private String imgUrl;
    private Comment[] comments;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Comment[] getReplies() {
        return comments;
    }

    public void setReplies(Comment[] comments) {
        this.comments = comments;
    }

    public void toLike() {}
    public void toReply() {}
    public void toShare() {}
}
