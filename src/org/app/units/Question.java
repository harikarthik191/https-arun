package org.app.units;

public class Question extends AbstractEntity{

    private String questionBody;
    private User user;

    public String getQuestionBody() {
        return questionBody;
    }

    public void setQuestionBody(String questionBody) {
        this.questionBody = questionBody;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    int id=0;

    @Override
    public void autoGenerateId(){
        id++;
        super.setId(id);
    }
}
