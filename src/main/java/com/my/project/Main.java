//https://www.youtube.com/watch?v=BywIOD_Y3CE
//https://developers.google.com/protocol-buffers/docs/proto3
package com.my.project;


import com.my.protoproject.proto.SamplePayload;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SamplePayload.Builder sampleLoad = SamplePayload.newBuilder();
        sampleLoad.setName("this");
        System.out.println("hi");
        System.out.println("hi");
    }
}
