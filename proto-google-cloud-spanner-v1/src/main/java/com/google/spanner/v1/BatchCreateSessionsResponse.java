/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/v1/spanner.proto

package com.google.spanner.v1;

/**
 *
 *
 * <pre>
 * The response for [BatchCreateSessions][google.spanner.v1.Spanner.BatchCreateSessions].
 * </pre>
 *
 * Protobuf type {@code google.spanner.v1.BatchCreateSessionsResponse}
 */
public final class BatchCreateSessionsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.spanner.v1.BatchCreateSessionsResponse)
    BatchCreateSessionsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BatchCreateSessionsResponse.newBuilder() to construct.
  private BatchCreateSessionsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BatchCreateSessionsResponse() {
    session_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BatchCreateSessionsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private BatchCreateSessionsResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                session_ = new java.util.ArrayList<com.google.spanner.v1.Session>();
                mutable_bitField0_ |= 0x00000001;
              }
              session_.add(
                  input.readMessage(com.google.spanner.v1.Session.parser(), extensionRegistry));
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        session_ = java.util.Collections.unmodifiableList(session_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.spanner.v1.SpannerProto
        .internal_static_google_spanner_v1_BatchCreateSessionsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.spanner.v1.SpannerProto
        .internal_static_google_spanner_v1_BatchCreateSessionsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.spanner.v1.BatchCreateSessionsResponse.class,
            com.google.spanner.v1.BatchCreateSessionsResponse.Builder.class);
  }

  public static final int SESSION_FIELD_NUMBER = 1;
  private java.util.List<com.google.spanner.v1.Session> session_;
  /**
   *
   *
   * <pre>
   * The freshly created sessions.
   * </pre>
   *
   * <code>repeated .google.spanner.v1.Session session = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.spanner.v1.Session> getSessionList() {
    return session_;
  }
  /**
   *
   *
   * <pre>
   * The freshly created sessions.
   * </pre>
   *
   * <code>repeated .google.spanner.v1.Session session = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.spanner.v1.SessionOrBuilder>
      getSessionOrBuilderList() {
    return session_;
  }
  /**
   *
   *
   * <pre>
   * The freshly created sessions.
   * </pre>
   *
   * <code>repeated .google.spanner.v1.Session session = 1;</code>
   */
  @java.lang.Override
  public int getSessionCount() {
    return session_.size();
  }
  /**
   *
   *
   * <pre>
   * The freshly created sessions.
   * </pre>
   *
   * <code>repeated .google.spanner.v1.Session session = 1;</code>
   */
  @java.lang.Override
  public com.google.spanner.v1.Session getSession(int index) {
    return session_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The freshly created sessions.
   * </pre>
   *
   * <code>repeated .google.spanner.v1.Session session = 1;</code>
   */
  @java.lang.Override
  public com.google.spanner.v1.SessionOrBuilder getSessionOrBuilder(int index) {
    return session_.get(index);
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    for (int i = 0; i < session_.size(); i++) {
      output.writeMessage(1, session_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < session_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, session_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.spanner.v1.BatchCreateSessionsResponse)) {
      return super.equals(obj);
    }
    com.google.spanner.v1.BatchCreateSessionsResponse other =
        (com.google.spanner.v1.BatchCreateSessionsResponse) obj;

    if (!getSessionList().equals(other.getSessionList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getSessionCount() > 0) {
      hash = (37 * hash) + SESSION_FIELD_NUMBER;
      hash = (53 * hash) + getSessionList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.spanner.v1.BatchCreateSessionsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.spanner.v1.BatchCreateSessionsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.spanner.v1.BatchCreateSessionsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.spanner.v1.BatchCreateSessionsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.spanner.v1.BatchCreateSessionsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.spanner.v1.BatchCreateSessionsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.spanner.v1.BatchCreateSessionsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.spanner.v1.BatchCreateSessionsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.spanner.v1.BatchCreateSessionsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.spanner.v1.BatchCreateSessionsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.spanner.v1.BatchCreateSessionsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.spanner.v1.BatchCreateSessionsResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.spanner.v1.BatchCreateSessionsResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * The response for [BatchCreateSessions][google.spanner.v1.Spanner.BatchCreateSessions].
   * </pre>
   *
   * Protobuf type {@code google.spanner.v1.BatchCreateSessionsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.spanner.v1.BatchCreateSessionsResponse)
      com.google.spanner.v1.BatchCreateSessionsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.spanner.v1.SpannerProto
          .internal_static_google_spanner_v1_BatchCreateSessionsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.spanner.v1.SpannerProto
          .internal_static_google_spanner_v1_BatchCreateSessionsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.spanner.v1.BatchCreateSessionsResponse.class,
              com.google.spanner.v1.BatchCreateSessionsResponse.Builder.class);
    }

    // Construct using com.google.spanner.v1.BatchCreateSessionsResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getSessionFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (sessionBuilder_ == null) {
        session_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        sessionBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.spanner.v1.SpannerProto
          .internal_static_google_spanner_v1_BatchCreateSessionsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.spanner.v1.BatchCreateSessionsResponse getDefaultInstanceForType() {
      return com.google.spanner.v1.BatchCreateSessionsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.spanner.v1.BatchCreateSessionsResponse build() {
      com.google.spanner.v1.BatchCreateSessionsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.spanner.v1.BatchCreateSessionsResponse buildPartial() {
      com.google.spanner.v1.BatchCreateSessionsResponse result =
          new com.google.spanner.v1.BatchCreateSessionsResponse(this);
      int from_bitField0_ = bitField0_;
      if (sessionBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          session_ = java.util.Collections.unmodifiableList(session_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.session_ = session_;
      } else {
        result.session_ = sessionBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.spanner.v1.BatchCreateSessionsResponse) {
        return mergeFrom((com.google.spanner.v1.BatchCreateSessionsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.spanner.v1.BatchCreateSessionsResponse other) {
      if (other == com.google.spanner.v1.BatchCreateSessionsResponse.getDefaultInstance())
        return this;
      if (sessionBuilder_ == null) {
        if (!other.session_.isEmpty()) {
          if (session_.isEmpty()) {
            session_ = other.session_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSessionIsMutable();
            session_.addAll(other.session_);
          }
          onChanged();
        }
      } else {
        if (!other.session_.isEmpty()) {
          if (sessionBuilder_.isEmpty()) {
            sessionBuilder_.dispose();
            sessionBuilder_ = null;
            session_ = other.session_;
            bitField0_ = (bitField0_ & ~0x00000001);
            sessionBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getSessionFieldBuilder()
                    : null;
          } else {
            sessionBuilder_.addAllMessages(other.session_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.spanner.v1.BatchCreateSessionsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.spanner.v1.BatchCreateSessionsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.spanner.v1.Session> session_ =
        java.util.Collections.emptyList();

    private void ensureSessionIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        session_ = new java.util.ArrayList<com.google.spanner.v1.Session>(session_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.spanner.v1.Session,
            com.google.spanner.v1.Session.Builder,
            com.google.spanner.v1.SessionOrBuilder>
        sessionBuilder_;

    /**
     *
     *
     * <pre>
     * The freshly created sessions.
     * </pre>
     *
     * <code>repeated .google.spanner.v1.Session session = 1;</code>
     */
    public java.util.List<com.google.spanner.v1.Session> getSessionList() {
      if (sessionBuilder_ == null) {
        return java.util.Collections.unmodifiableList(session_);
      } else {
        return sessionBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The freshly created sessions.
     * </pre>
     *
     * <code>repeated .google.spanner.v1.Session session = 1;</code>
     */
    public int getSessionCount() {
      if (sessionBuilder_ == null) {
        return session_.size();
      } else {
        return sessionBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The freshly created sessions.
     * </pre>
     *
     * <code>repeated .google.spanner.v1.Session session = 1;</code>
     */
    public com.google.spanner.v1.Session getSession(int index) {
      if (sessionBuilder_ == null) {
        return session_.get(index);
      } else {
        return sessionBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The freshly created sessions.
     * </pre>
     *
     * <code>repeated .google.spanner.v1.Session session = 1;</code>
     */
    public Builder setSession(int index, com.google.spanner.v1.Session value) {
      if (sessionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSessionIsMutable();
        session_.set(index, value);
        onChanged();
      } else {
        sessionBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The freshly created sessions.
     * </pre>
     *
     * <code>repeated .google.spanner.v1.Session session = 1;</code>
     */
    public Builder setSession(int index, com.google.spanner.v1.Session.Builder builderForValue) {
      if (sessionBuilder_ == null) {
        ensureSessionIsMutable();
        session_.set(index, builderForValue.build());
        onChanged();
      } else {
        sessionBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The freshly created sessions.
     * </pre>
     *
     * <code>repeated .google.spanner.v1.Session session = 1;</code>
     */
    public Builder addSession(com.google.spanner.v1.Session value) {
      if (sessionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSessionIsMutable();
        session_.add(value);
        onChanged();
      } else {
        sessionBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The freshly created sessions.
     * </pre>
     *
     * <code>repeated .google.spanner.v1.Session session = 1;</code>
     */
    public Builder addSession(int index, com.google.spanner.v1.Session value) {
      if (sessionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSessionIsMutable();
        session_.add(index, value);
        onChanged();
      } else {
        sessionBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The freshly created sessions.
     * </pre>
     *
     * <code>repeated .google.spanner.v1.Session session = 1;</code>
     */
    public Builder addSession(com.google.spanner.v1.Session.Builder builderForValue) {
      if (sessionBuilder_ == null) {
        ensureSessionIsMutable();
        session_.add(builderForValue.build());
        onChanged();
      } else {
        sessionBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The freshly created sessions.
     * </pre>
     *
     * <code>repeated .google.spanner.v1.Session session = 1;</code>
     */
    public Builder addSession(int index, com.google.spanner.v1.Session.Builder builderForValue) {
      if (sessionBuilder_ == null) {
        ensureSessionIsMutable();
        session_.add(index, builderForValue.build());
        onChanged();
      } else {
        sessionBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The freshly created sessions.
     * </pre>
     *
     * <code>repeated .google.spanner.v1.Session session = 1;</code>
     */
    public Builder addAllSession(
        java.lang.Iterable<? extends com.google.spanner.v1.Session> values) {
      if (sessionBuilder_ == null) {
        ensureSessionIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, session_);
        onChanged();
      } else {
        sessionBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The freshly created sessions.
     * </pre>
     *
     * <code>repeated .google.spanner.v1.Session session = 1;</code>
     */
    public Builder clearSession() {
      if (sessionBuilder_ == null) {
        session_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        sessionBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The freshly created sessions.
     * </pre>
     *
     * <code>repeated .google.spanner.v1.Session session = 1;</code>
     */
    public Builder removeSession(int index) {
      if (sessionBuilder_ == null) {
        ensureSessionIsMutable();
        session_.remove(index);
        onChanged();
      } else {
        sessionBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The freshly created sessions.
     * </pre>
     *
     * <code>repeated .google.spanner.v1.Session session = 1;</code>
     */
    public com.google.spanner.v1.Session.Builder getSessionBuilder(int index) {
      return getSessionFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The freshly created sessions.
     * </pre>
     *
     * <code>repeated .google.spanner.v1.Session session = 1;</code>
     */
    public com.google.spanner.v1.SessionOrBuilder getSessionOrBuilder(int index) {
      if (sessionBuilder_ == null) {
        return session_.get(index);
      } else {
        return sessionBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The freshly created sessions.
     * </pre>
     *
     * <code>repeated .google.spanner.v1.Session session = 1;</code>
     */
    public java.util.List<? extends com.google.spanner.v1.SessionOrBuilder>
        getSessionOrBuilderList() {
      if (sessionBuilder_ != null) {
        return sessionBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(session_);
      }
    }
    /**
     *
     *
     * <pre>
     * The freshly created sessions.
     * </pre>
     *
     * <code>repeated .google.spanner.v1.Session session = 1;</code>
     */
    public com.google.spanner.v1.Session.Builder addSessionBuilder() {
      return getSessionFieldBuilder()
          .addBuilder(com.google.spanner.v1.Session.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The freshly created sessions.
     * </pre>
     *
     * <code>repeated .google.spanner.v1.Session session = 1;</code>
     */
    public com.google.spanner.v1.Session.Builder addSessionBuilder(int index) {
      return getSessionFieldBuilder()
          .addBuilder(index, com.google.spanner.v1.Session.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The freshly created sessions.
     * </pre>
     *
     * <code>repeated .google.spanner.v1.Session session = 1;</code>
     */
    public java.util.List<com.google.spanner.v1.Session.Builder> getSessionBuilderList() {
      return getSessionFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.spanner.v1.Session,
            com.google.spanner.v1.Session.Builder,
            com.google.spanner.v1.SessionOrBuilder>
        getSessionFieldBuilder() {
      if (sessionBuilder_ == null) {
        sessionBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.spanner.v1.Session,
                com.google.spanner.v1.Session.Builder,
                com.google.spanner.v1.SessionOrBuilder>(
                session_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        session_ = null;
      }
      return sessionBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.spanner.v1.BatchCreateSessionsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.spanner.v1.BatchCreateSessionsResponse)
  private static final com.google.spanner.v1.BatchCreateSessionsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.spanner.v1.BatchCreateSessionsResponse();
  }

  public static com.google.spanner.v1.BatchCreateSessionsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchCreateSessionsResponse> PARSER =
      new com.google.protobuf.AbstractParser<BatchCreateSessionsResponse>() {
        @java.lang.Override
        public BatchCreateSessionsResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new BatchCreateSessionsResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<BatchCreateSessionsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchCreateSessionsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.spanner.v1.BatchCreateSessionsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
