package com.example.SpringBootRestApi.models;

import java.util.List;

public class MembersResponse {
    public String result;
    public List<Member> members;

    public MembersResponse(String result) {
        this.result = result;
    }

    public MembersResponse(String result, List<Member> members) {
        this.result = result;
        this.members = members;
    }
}
