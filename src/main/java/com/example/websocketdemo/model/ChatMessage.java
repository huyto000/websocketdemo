package com.example.websocketdemo.model;

/**
 * Created by rajeevkumarsingh on 24/07/17.
 */
public class ChatMessage {
    public ChatMessage(){}
    public ChatMessage(String content) {
        this.content = content;
    }

    private String content;





    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


}
