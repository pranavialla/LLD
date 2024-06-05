package behavioural.momento;

public class Git {
    String commitID;
    String author;
    Long date;
    String description;
    String data;

    public Git(String author) {
        this.author=author;

    }


    public Git(String commitID, String author, String description, String data) {
        this.commitID=commitID;
        this.author=author;
        this.date=System.currentTimeMillis();
        this.description=description;
        this.data=data;
    }

    public Git(String commitID, String author, String description, String data, Long date) {
        this.commitID=commitID;
        this.author=author;
        this.date=System.currentTimeMillis();
        this.description=description;
        this.data=data;
    }


    public String getCommitID() {
        return commitID;
    }

    public void setCommitID(String commitID) {
        this.commitID = commitID;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Git capture() {
        return new Git(this.commitID, this.author, this.description, this.data, this.date);
    }

    public void setGit(Git git) {
        this.commitID=git.commitID;
        this.author=git.author;
        this.date=System.currentTimeMillis();
        this.description=git.description;
        this.data=git.data;
    }

    @Override
    public String toString() {
        return "Git{" + "commitID=" + commitID + ", author=" + author + ", date=" + date + ", description=" + description + ", data=" + data + '}';
    }
}
