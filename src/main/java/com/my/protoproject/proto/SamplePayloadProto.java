// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/SamplePayload.proto

package com.my.protoproject.proto;

public final class SamplePayloadProto {
  private SamplePayloadProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SomeProto_SamplePayload_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SomeProto_SamplePayload_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031proto/SamplePayload.proto\022\tSomeProto\"\035" +
      "\n\rSamplePayload\022\014\n\004name\030\001 \001(\tB1\n\031com.my." +
      "protoproject.protoB\022SamplePayloadProtoP\001"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SomeProto_SamplePayload_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SomeProto_SamplePayload_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SomeProto_SamplePayload_descriptor,
        new java.lang.String[] { "Name", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}