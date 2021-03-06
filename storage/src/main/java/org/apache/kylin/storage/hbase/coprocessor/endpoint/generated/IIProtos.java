/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/
package org.apache.kylin.storage.hbase.coprocessor.endpoint.generated;

public final class IIProtos {
    private IIProtos() {
    }

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    }

    public interface IIRequestOrBuilder extends com.google.protobuf.MessageOrBuilder {

        // required bytes type = 1;
        /**
         * <code>required bytes type = 1;</code>
         */
        boolean hasType();

        /**
         * <code>required bytes type = 1;</code>
         */
        com.google.protobuf.ByteString getType();

        // required bytes filter = 2;
        /**
         * <code>required bytes filter = 2;</code>
         */
        boolean hasFilter();

        /**
         * <code>required bytes filter = 2;</code>
         */
        com.google.protobuf.ByteString getFilter();

        // required bytes projector = 3;
        /**
         * <code>required bytes projector = 3;</code>
         */
        boolean hasProjector();

        /**
         * <code>required bytes projector = 3;</code>
         */
        com.google.protobuf.ByteString getProjector();

        // required bytes aggregator = 4;
        /**
         * <code>required bytes aggregator = 4;</code>
         */
        boolean hasAggregator();

        /**
         * <code>required bytes aggregator = 4;</code>
         */
        com.google.protobuf.ByteString getAggregator();
    }

    /**
     * Protobuf type {@code IIRequest}
     */
    public static final class IIRequest extends com.google.protobuf.GeneratedMessage implements IIRequestOrBuilder {
        // Use IIRequest.newBuilder() to construct.
        private IIRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }

        private IIRequest(boolean noInit) {
            this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }

        private static final IIRequest defaultInstance;

        public static IIRequest getDefaultInstance() {
            return defaultInstance;
        }

        public IIRequest getDefaultInstanceForType() {
            return defaultInstance;
        }

        private final com.google.protobuf.UnknownFieldSet unknownFields;

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private IIRequest(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            initFields();
            int mutable_bitField0_ = 0;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields = com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                    case 0:
                        done = true;
                        break;
                    default: {
                        if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                            done = true;
                        }
                        break;
                    }
                    case 10: {
                        bitField0_ |= 0x00000001;
                        type_ = input.readBytes();
                        break;
                    }
                    case 18: {
                        bitField0_ |= 0x00000002;
                        filter_ = input.readBytes();
                        break;
                    }
                    case 26: {
                        bitField0_ |= 0x00000004;
                        projector_ = input.readBytes();
                        break;
                    }
                    case 34: {
                        bitField0_ |= 0x00000008;
                        aggregator_ = input.readBytes();
                        break;
                    }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.internal_static_IIRequest_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.internal_static_IIRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIRequest.class, org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIRequest.Builder.class);
        }

        public static com.google.protobuf.Parser<IIRequest> PARSER = new com.google.protobuf.AbstractParser<IIRequest>() {
            public IIRequest parsePartialFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
                return new IIRequest(input, extensionRegistry);
            }
        };

        @java.lang.Override
        public com.google.protobuf.Parser<IIRequest> getParserForType() {
            return PARSER;
        }

        private int bitField0_;
        // required bytes type = 1;
        public static final int TYPE_FIELD_NUMBER = 1;
        private com.google.protobuf.ByteString type_;

        /**
         * <code>required bytes type = 1;</code>
         */
        public boolean hasType() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }

        /**
         * <code>required bytes type = 1;</code>
         */
        public com.google.protobuf.ByteString getType() {
            return type_;
        }

        // required bytes filter = 2;
        public static final int FILTER_FIELD_NUMBER = 2;
        private com.google.protobuf.ByteString filter_;

        /**
         * <code>required bytes filter = 2;</code>
         */
        public boolean hasFilter() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }

        /**
         * <code>required bytes filter = 2;</code>
         */
        public com.google.protobuf.ByteString getFilter() {
            return filter_;
        }

        // required bytes projector = 3;
        public static final int PROJECTOR_FIELD_NUMBER = 3;
        private com.google.protobuf.ByteString projector_;

        /**
         * <code>required bytes projector = 3;</code>
         */
        public boolean hasProjector() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }

        /**
         * <code>required bytes projector = 3;</code>
         */
        public com.google.protobuf.ByteString getProjector() {
            return projector_;
        }

        // required bytes aggregator = 4;
        public static final int AGGREGATOR_FIELD_NUMBER = 4;
        private com.google.protobuf.ByteString aggregator_;

        /**
         * <code>required bytes aggregator = 4;</code>
         */
        public boolean hasAggregator() {
            return ((bitField0_ & 0x00000008) == 0x00000008);
        }

        /**
         * <code>required bytes aggregator = 4;</code>
         */
        public com.google.protobuf.ByteString getAggregator() {
            return aggregator_;
        }

        private void initFields() {
            type_ = com.google.protobuf.ByteString.EMPTY;
            filter_ = com.google.protobuf.ByteString.EMPTY;
            projector_ = com.google.protobuf.ByteString.EMPTY;
            aggregator_ = com.google.protobuf.ByteString.EMPTY;
        }

        private byte memoizedIsInitialized = -1;

        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1)
                return isInitialized == 1;

            if (!hasType()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!hasFilter()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!hasProjector()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!hasAggregator()) {
                memoizedIsInitialized = 0;
                return false;
            }
            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeBytes(1, type_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeBytes(2, filter_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                output.writeBytes(3, projector_);
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                output.writeBytes(4, aggregator_);
            }
            getUnknownFields().writeTo(output);
        }

        private int memoizedSerializedSize = -1;

        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1)
                return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream.computeBytesSize(1, type_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream.computeBytesSize(2, filter_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.google.protobuf.CodedOutputStream.computeBytesSize(3, projector_);
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                size += com.google.protobuf.CodedOutputStream.computeBytesSize(4, aggregator_);
            }
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;

        @java.lang.Override
        protected java.lang.Object writeReplace() throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIRequest)) {
                return super.equals(obj);
            }
            org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIRequest other = (org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIRequest) obj;

            boolean result = true;
            result = result && (hasType() == other.hasType());
            if (hasType()) {
                result = result && getType().equals(other.getType());
            }
            result = result && (hasFilter() == other.hasFilter());
            if (hasFilter()) {
                result = result && getFilter().equals(other.getFilter());
            }
            result = result && (hasProjector() == other.hasProjector());
            if (hasProjector()) {
                result = result && getProjector().equals(other.getProjector());
            }
            result = result && (hasAggregator() == other.hasAggregator());
            if (hasAggregator()) {
                result = result && getAggregator().equals(other.getAggregator());
            }
            result = result && getUnknownFields().equals(other.getUnknownFields());
            return result;
        }

        private int memoizedHashCode = 0;

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptorForType().hashCode();
            if (hasType()) {
                hash = (37 * hash) + TYPE_FIELD_NUMBER;
                hash = (53 * hash) + getType().hashCode();
            }
            if (hasFilter()) {
                hash = (37 * hash) + FILTER_FIELD_NUMBER;
                hash = (53 * hash) + getFilter().hashCode();
            }
            if (hasProjector()) {
                hash = (37 * hash) + PROJECTOR_FIELD_NUMBER;
                hash = (53 * hash) + getProjector().hashCode();
            }
            if (hasAggregator()) {
                hash = (37 * hash) + AGGREGATOR_FIELD_NUMBER;
                hash = (53 * hash) + getAggregator().hashCode();
            }
            hash = (29 * hash) + getUnknownFields().hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIRequest parseFrom(com.google.protobuf.ByteString data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIRequest parseFrom(com.google.protobuf.ByteString data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIRequest parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIRequest parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIRequest parseFrom(java.io.InputStream input) throws java.io.IOException {
            return PARSER.parseFrom(input);
        }

        public static org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIRequest parseFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIRequest parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }

        public static org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIRequest parseDelimitedFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIRequest parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return PARSER.parseFrom(input);
        }

        public static org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIRequest parseFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIRequest prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        /**
         * Protobuf type {@code IIRequest}
         */
        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIRequestOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.internal_static_IIRequest_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.internal_static_IIRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIRequest.class, org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIRequest.Builder.class);
            }

            // Construct using org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIRequest.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
                }
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                type_ = com.google.protobuf.ByteString.EMPTY;
                bitField0_ = (bitField0_ & ~0x00000001);
                filter_ = com.google.protobuf.ByteString.EMPTY;
                bitField0_ = (bitField0_ & ~0x00000002);
                projector_ = com.google.protobuf.ByteString.EMPTY;
                bitField0_ = (bitField0_ & ~0x00000004);
                aggregator_ = com.google.protobuf.ByteString.EMPTY;
                bitField0_ = (bitField0_ & ~0x00000008);
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.internal_static_IIRequest_descriptor;
            }

            public org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIRequest getDefaultInstanceForType() {
                return org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIRequest.getDefaultInstance();
            }

            public org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIRequest build() {
                org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIRequest result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIRequest buildPartial() {
                org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIRequest result = new org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIRequest(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.type_ = type_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.filter_ = filter_;
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                    to_bitField0_ |= 0x00000004;
                }
                result.projector_ = projector_;
                if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
                    to_bitField0_ |= 0x00000008;
                }
                result.aggregator_ = aggregator_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIRequest) {
                    return mergeFrom((org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIRequest) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIRequest other) {
                if (other == org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIRequest.getDefaultInstance())
                    return this;
                if (other.hasType()) {
                    setType(other.getType());
                }
                if (other.hasFilter()) {
                    setFilter(other.getFilter());
                }
                if (other.hasProjector()) {
                    setProjector(other.getProjector());
                }
                if (other.hasAggregator()) {
                    setAggregator(other.getAggregator());
                }
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasType()) {

                    return false;
                }
                if (!hasFilter()) {

                    return false;
                }
                if (!hasProjector()) {

                    return false;
                }
                if (!hasAggregator()) {

                    return false;
                }
                return true;
            }

            public Builder mergeFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
                org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIRequest parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIRequest) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int bitField0_;

            // required bytes type = 1;
            private com.google.protobuf.ByteString type_ = com.google.protobuf.ByteString.EMPTY;

            /**
             * <code>required bytes type = 1;</code>
             */
            public boolean hasType() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }

            /**
             * <code>required bytes type = 1;</code>
             */
            public com.google.protobuf.ByteString getType() {
                return type_;
            }

            /**
             * <code>required bytes type = 1;</code>
             */
            public Builder setType(com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                type_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>required bytes type = 1;</code>
             */
            public Builder clearType() {
                bitField0_ = (bitField0_ & ~0x00000001);
                type_ = getDefaultInstance().getType();
                onChanged();
                return this;
            }

            // required bytes filter = 2;
            private com.google.protobuf.ByteString filter_ = com.google.protobuf.ByteString.EMPTY;

            /**
             * <code>required bytes filter = 2;</code>
             */
            public boolean hasFilter() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }

            /**
             * <code>required bytes filter = 2;</code>
             */
            public com.google.protobuf.ByteString getFilter() {
                return filter_;
            }

            /**
             * <code>required bytes filter = 2;</code>
             */
            public Builder setFilter(com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                filter_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>required bytes filter = 2;</code>
             */
            public Builder clearFilter() {
                bitField0_ = (bitField0_ & ~0x00000002);
                filter_ = getDefaultInstance().getFilter();
                onChanged();
                return this;
            }

            // required bytes projector = 3;
            private com.google.protobuf.ByteString projector_ = com.google.protobuf.ByteString.EMPTY;

            /**
             * <code>required bytes projector = 3;</code>
             */
            public boolean hasProjector() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }

            /**
             * <code>required bytes projector = 3;</code>
             */
            public com.google.protobuf.ByteString getProjector() {
                return projector_;
            }

            /**
             * <code>required bytes projector = 3;</code>
             */
            public Builder setProjector(com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000004;
                projector_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>required bytes projector = 3;</code>
             */
            public Builder clearProjector() {
                bitField0_ = (bitField0_ & ~0x00000004);
                projector_ = getDefaultInstance().getProjector();
                onChanged();
                return this;
            }

            // required bytes aggregator = 4;
            private com.google.protobuf.ByteString aggregator_ = com.google.protobuf.ByteString.EMPTY;

            /**
             * <code>required bytes aggregator = 4;</code>
             */
            public boolean hasAggregator() {
                return ((bitField0_ & 0x00000008) == 0x00000008);
            }

            /**
             * <code>required bytes aggregator = 4;</code>
             */
            public com.google.protobuf.ByteString getAggregator() {
                return aggregator_;
            }

            /**
             * <code>required bytes aggregator = 4;</code>
             */
            public Builder setAggregator(com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000008;
                aggregator_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>required bytes aggregator = 4;</code>
             */
            public Builder clearAggregator() {
                bitField0_ = (bitField0_ & ~0x00000008);
                aggregator_ = getDefaultInstance().getAggregator();
                onChanged();
                return this;
            }

            // @@protoc_insertion_point(builder_scope:IIRequest)
        }

        static {
            defaultInstance = new IIRequest(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:IIRequest)
    }

    public interface IIResponseOrBuilder extends com.google.protobuf.MessageOrBuilder {

        // repeated .IIResponse.IIRow rows = 1;
        /**
         * <code>repeated .IIResponse.IIRow rows = 1;</code>
         */
        java.util.List<org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRow> getRowsList();

        /**
         * <code>repeated .IIResponse.IIRow rows = 1;</code>
         */
        org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRow getRows(int index);

        /**
         * <code>repeated .IIResponse.IIRow rows = 1;</code>
         */
        int getRowsCount();

        /**
         * <code>repeated .IIResponse.IIRow rows = 1;</code>
         */
        java.util.List<? extends org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRowOrBuilder> getRowsOrBuilderList();

        /**
         * <code>repeated .IIResponse.IIRow rows = 1;</code>
         */
        org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRowOrBuilder getRowsOrBuilder(int index);
    }

    /**
     * Protobuf type {@code IIResponse}
     */
    public static final class IIResponse extends com.google.protobuf.GeneratedMessage implements IIResponseOrBuilder {
        // Use IIResponse.newBuilder() to construct.
        private IIResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }

        private IIResponse(boolean noInit) {
            this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }

        private static final IIResponse defaultInstance;

        public static IIResponse getDefaultInstance() {
            return defaultInstance;
        }

        public IIResponse getDefaultInstanceForType() {
            return defaultInstance;
        }

        private final com.google.protobuf.UnknownFieldSet unknownFields;

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private IIResponse(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            initFields();
            int mutable_bitField0_ = 0;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields = com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                    case 0:
                        done = true;
                        break;
                    default: {
                        if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                            done = true;
                        }
                        break;
                    }
                    case 10: {
                        if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                            rows_ = new java.util.ArrayList<org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRow>();
                            mutable_bitField0_ |= 0x00000001;
                        }
                        rows_.add(input.readMessage(org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRow.PARSER, extensionRegistry));
                        break;
                    }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
            } finally {
                if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                    rows_ = java.util.Collections.unmodifiableList(rows_);
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.internal_static_IIResponse_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.internal_static_IIResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.class, org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.Builder.class);
        }

        public static com.google.protobuf.Parser<IIResponse> PARSER = new com.google.protobuf.AbstractParser<IIResponse>() {
            public IIResponse parsePartialFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
                return new IIResponse(input, extensionRegistry);
            }
        };

        @java.lang.Override
        public com.google.protobuf.Parser<IIResponse> getParserForType() {
            return PARSER;
        }

        public interface IIRowOrBuilder extends com.google.protobuf.MessageOrBuilder {

            // required bytes columns = 1;
            /**
             * <code>required bytes columns = 1;</code>
             */
            boolean hasColumns();

            /**
             * <code>required bytes columns = 1;</code>
             */
            com.google.protobuf.ByteString getColumns();

            // optional bytes measures = 2;
            /**
             * <code>optional bytes measures = 2;</code>
             */
            boolean hasMeasures();

            /**
             * <code>optional bytes measures = 2;</code>
             */
            com.google.protobuf.ByteString getMeasures();
        }

        /**
         * Protobuf type {@code IIResponse.IIRow}
         */
        public static final class IIRow extends com.google.protobuf.GeneratedMessage implements IIRowOrBuilder {
            // Use IIRow.newBuilder() to construct.
            private IIRow(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
                super(builder);
                this.unknownFields = builder.getUnknownFields();
            }

            private IIRow(boolean noInit) {
                this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
            }

            private static final IIRow defaultInstance;

            public static IIRow getDefaultInstance() {
                return defaultInstance;
            }

            public IIRow getDefaultInstanceForType() {
                return defaultInstance;
            }

            private final com.google.protobuf.UnknownFieldSet unknownFields;

            @java.lang.Override
            public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
                return this.unknownFields;
            }

            private IIRow(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
                initFields();
                int mutable_bitField0_ = 0;
                com.google.protobuf.UnknownFieldSet.Builder unknownFields = com.google.protobuf.UnknownFieldSet.newBuilder();
                try {
                    boolean done = false;
                    while (!done) {
                        int tag = input.readTag();
                        switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 10: {
                            bitField0_ |= 0x00000001;
                            columns_ = input.readBytes();
                            break;
                        }
                        case 18: {
                            bitField0_ |= 0x00000002;
                            measures_ = input.readBytes();
                            break;
                        }
                        }
                    }
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e) {
                    throw new com.google.protobuf.InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
                } finally {
                    this.unknownFields = unknownFields.build();
                    makeExtensionsImmutable();
                }
            }

            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.internal_static_IIResponse_IIRow_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.internal_static_IIResponse_IIRow_fieldAccessorTable.ensureFieldAccessorsInitialized(org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRow.class, org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRow.Builder.class);
            }

            public static com.google.protobuf.Parser<IIRow> PARSER = new com.google.protobuf.AbstractParser<IIRow>() {
                public IIRow parsePartialFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
                    return new IIRow(input, extensionRegistry);
                }
            };

            @java.lang.Override
            public com.google.protobuf.Parser<IIRow> getParserForType() {
                return PARSER;
            }

            private int bitField0_;
            // required bytes columns = 1;
            public static final int COLUMNS_FIELD_NUMBER = 1;
            private com.google.protobuf.ByteString columns_;

            /**
             * <code>required bytes columns = 1;</code>
             */
            public boolean hasColumns() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }

            /**
             * <code>required bytes columns = 1;</code>
             */
            public com.google.protobuf.ByteString getColumns() {
                return columns_;
            }

            // optional bytes measures = 2;
            public static final int MEASURES_FIELD_NUMBER = 2;
            private com.google.protobuf.ByteString measures_;

            /**
             * <code>optional bytes measures = 2;</code>
             */
            public boolean hasMeasures() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }

            /**
             * <code>optional bytes measures = 2;</code>
             */
            public com.google.protobuf.ByteString getMeasures() {
                return measures_;
            }

            private void initFields() {
                columns_ = com.google.protobuf.ByteString.EMPTY;
                measures_ = com.google.protobuf.ByteString.EMPTY;
            }

            private byte memoizedIsInitialized = -1;

            public final boolean isInitialized() {
                byte isInitialized = memoizedIsInitialized;
                if (isInitialized != -1)
                    return isInitialized == 1;

                if (!hasColumns()) {
                    memoizedIsInitialized = 0;
                    return false;
                }
                memoizedIsInitialized = 1;
                return true;
            }

            public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
                getSerializedSize();
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                    output.writeBytes(1, columns_);
                }
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                    output.writeBytes(2, measures_);
                }
                getUnknownFields().writeTo(output);
            }

            private int memoizedSerializedSize = -1;

            public int getSerializedSize() {
                int size = memoizedSerializedSize;
                if (size != -1)
                    return size;

                size = 0;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                    size += com.google.protobuf.CodedOutputStream.computeBytesSize(1, columns_);
                }
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                    size += com.google.protobuf.CodedOutputStream.computeBytesSize(2, measures_);
                }
                size += getUnknownFields().getSerializedSize();
                memoizedSerializedSize = size;
                return size;
            }

            private static final long serialVersionUID = 0L;

            @java.lang.Override
            protected java.lang.Object writeReplace() throws java.io.ObjectStreamException {
                return super.writeReplace();
            }

            @java.lang.Override
            public boolean equals(final java.lang.Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRow)) {
                    return super.equals(obj);
                }
                org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRow other = (org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRow) obj;

                boolean result = true;
                result = result && (hasColumns() == other.hasColumns());
                if (hasColumns()) {
                    result = result && getColumns().equals(other.getColumns());
                }
                result = result && (hasMeasures() == other.hasMeasures());
                if (hasMeasures()) {
                    result = result && getMeasures().equals(other.getMeasures());
                }
                result = result && getUnknownFields().equals(other.getUnknownFields());
                return result;
            }

            private int memoizedHashCode = 0;

            @java.lang.Override
            public int hashCode() {
                if (memoizedHashCode != 0) {
                    return memoizedHashCode;
                }
                int hash = 41;
                hash = (19 * hash) + getDescriptorForType().hashCode();
                if (hasColumns()) {
                    hash = (37 * hash) + COLUMNS_FIELD_NUMBER;
                    hash = (53 * hash) + getColumns().hashCode();
                }
                if (hasMeasures()) {
                    hash = (37 * hash) + MEASURES_FIELD_NUMBER;
                    hash = (53 * hash) + getMeasures().hashCode();
                }
                hash = (29 * hash) + getUnknownFields().hashCode();
                memoizedHashCode = hash;
                return hash;
            }

            public static org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRow parseFrom(com.google.protobuf.ByteString data) throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }

            public static org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRow parseFrom(com.google.protobuf.ByteString data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }

            public static org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRow parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }

            public static org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRow parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }

            public static org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRow parseFrom(java.io.InputStream input) throws java.io.IOException {
                return PARSER.parseFrom(input);
            }

            public static org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRow parseFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
                return PARSER.parseFrom(input, extensionRegistry);
            }

            public static org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRow parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
                return PARSER.parseDelimitedFrom(input);
            }

            public static org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRow parseDelimitedFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
                return PARSER.parseDelimitedFrom(input, extensionRegistry);
            }

            public static org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRow parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
                return PARSER.parseFrom(input);
            }

            public static org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRow parseFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
                return PARSER.parseFrom(input, extensionRegistry);
            }

            public static Builder newBuilder() {
                return Builder.create();
            }

            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static Builder newBuilder(org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRow prototype) {
                return newBuilder().mergeFrom(prototype);
            }

            public Builder toBuilder() {
                return newBuilder(this);
            }

            @java.lang.Override
            protected Builder newBuilderForType(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                Builder builder = new Builder(parent);
                return builder;
            }

            /**
             * Protobuf type {@code IIResponse.IIRow}
             */
            public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRowOrBuilder {
                public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                    return org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.internal_static_IIResponse_IIRow_descriptor;
                }

                protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                    return org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.internal_static_IIResponse_IIRow_fieldAccessorTable.ensureFieldAccessorsInitialized(org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRow.class, org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRow.Builder.class);
                }

                // Construct using org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRow.newBuilder()
                private Builder() {
                    maybeForceBuilderInitialization();
                }

                private Builder(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                    super(parent);
                    maybeForceBuilderInitialization();
                }

                private void maybeForceBuilderInitialization() {
                    if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
                    }
                }

                private static Builder create() {
                    return new Builder();
                }

                public Builder clear() {
                    super.clear();
                    columns_ = com.google.protobuf.ByteString.EMPTY;
                    bitField0_ = (bitField0_ & ~0x00000001);
                    measures_ = com.google.protobuf.ByteString.EMPTY;
                    bitField0_ = (bitField0_ & ~0x00000002);
                    return this;
                }

                public Builder clone() {
                    return create().mergeFrom(buildPartial());
                }

                public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                    return org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.internal_static_IIResponse_IIRow_descriptor;
                }

                public org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRow getDefaultInstanceForType() {
                    return org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRow.getDefaultInstance();
                }

                public org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRow build() {
                    org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRow result = buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    }
                    return result;
                }

                public org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRow buildPartial() {
                    org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRow result = new org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRow(this);
                    int from_bitField0_ = bitField0_;
                    int to_bitField0_ = 0;
                    if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                        to_bitField0_ |= 0x00000001;
                    }
                    result.columns_ = columns_;
                    if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                        to_bitField0_ |= 0x00000002;
                    }
                    result.measures_ = measures_;
                    result.bitField0_ = to_bitField0_;
                    onBuilt();
                    return result;
                }

                public Builder mergeFrom(com.google.protobuf.Message other) {
                    if (other instanceof org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRow) {
                        return mergeFrom((org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRow) other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }

                public Builder mergeFrom(org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRow other) {
                    if (other == org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRow.getDefaultInstance())
                        return this;
                    if (other.hasColumns()) {
                        setColumns(other.getColumns());
                    }
                    if (other.hasMeasures()) {
                        setMeasures(other.getMeasures());
                    }
                    this.mergeUnknownFields(other.getUnknownFields());
                    return this;
                }

                public final boolean isInitialized() {
                    if (!hasColumns()) {

                        return false;
                    }
                    return true;
                }

                public Builder mergeFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
                    org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRow parsedMessage = null;
                    try {
                        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                        parsedMessage = (org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRow) e.getUnfinishedMessage();
                        throw e;
                    } finally {
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                    }
                    return this;
                }

                private int bitField0_;

                // required bytes columns = 1;
                private com.google.protobuf.ByteString columns_ = com.google.protobuf.ByteString.EMPTY;

                /**
                 * <code>required bytes columns = 1;</code>
                 */
                public boolean hasColumns() {
                    return ((bitField0_ & 0x00000001) == 0x00000001);
                }

                /**
                 * <code>required bytes columns = 1;</code>
                 */
                public com.google.protobuf.ByteString getColumns() {
                    return columns_;
                }

                /**
                 * <code>required bytes columns = 1;</code>
                 */
                public Builder setColumns(com.google.protobuf.ByteString value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000001;
                    columns_ = value;
                    onChanged();
                    return this;
                }

                /**
                 * <code>required bytes columns = 1;</code>
                 */
                public Builder clearColumns() {
                    bitField0_ = (bitField0_ & ~0x00000001);
                    columns_ = getDefaultInstance().getColumns();
                    onChanged();
                    return this;
                }

                // optional bytes measures = 2;
                private com.google.protobuf.ByteString measures_ = com.google.protobuf.ByteString.EMPTY;

                /**
                 * <code>optional bytes measures = 2;</code>
                 */
                public boolean hasMeasures() {
                    return ((bitField0_ & 0x00000002) == 0x00000002);
                }

                /**
                 * <code>optional bytes measures = 2;</code>
                 */
                public com.google.protobuf.ByteString getMeasures() {
                    return measures_;
                }

                /**
                 * <code>optional bytes measures = 2;</code>
                 */
                public Builder setMeasures(com.google.protobuf.ByteString value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000002;
                    measures_ = value;
                    onChanged();
                    return this;
                }

                /**
                 * <code>optional bytes measures = 2;</code>
                 */
                public Builder clearMeasures() {
                    bitField0_ = (bitField0_ & ~0x00000002);
                    measures_ = getDefaultInstance().getMeasures();
                    onChanged();
                    return this;
                }

                // @@protoc_insertion_point(builder_scope:IIResponse.IIRow)
            }

            static {
                defaultInstance = new IIRow(true);
                defaultInstance.initFields();
            }

            // @@protoc_insertion_point(class_scope:IIResponse.IIRow)
        }

        // repeated .IIResponse.IIRow rows = 1;
        public static final int ROWS_FIELD_NUMBER = 1;
        private java.util.List<org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRow> rows_;

        /**
         * <code>repeated .IIResponse.IIRow rows = 1;</code>
         */
        public java.util.List<org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRow> getRowsList() {
            return rows_;
        }

        /**
         * <code>repeated .IIResponse.IIRow rows = 1;</code>
         */
        public java.util.List<? extends org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRowOrBuilder> getRowsOrBuilderList() {
            return rows_;
        }

        /**
         * <code>repeated .IIResponse.IIRow rows = 1;</code>
         */
        public int getRowsCount() {
            return rows_.size();
        }

        /**
         * <code>repeated .IIResponse.IIRow rows = 1;</code>
         */
        public org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRow getRows(int index) {
            return rows_.get(index);
        }

        /**
         * <code>repeated .IIResponse.IIRow rows = 1;</code>
         */
        public org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRowOrBuilder getRowsOrBuilder(int index) {
            return rows_.get(index);
        }

        private void initFields() {
            rows_ = java.util.Collections.emptyList();
        }

        private byte memoizedIsInitialized = -1;

        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1)
                return isInitialized == 1;

            for (int i = 0; i < getRowsCount(); i++) {
                if (!getRows(i).isInitialized()) {
                    memoizedIsInitialized = 0;
                    return false;
                }
            }
            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
            getSerializedSize();
            for (int i = 0; i < rows_.size(); i++) {
                output.writeMessage(1, rows_.get(i));
            }
            getUnknownFields().writeTo(output);
        }

        private int memoizedSerializedSize = -1;

        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1)
                return size;

            size = 0;
            for (int i = 0; i < rows_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, rows_.get(i));
            }
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;

        @java.lang.Override
        protected java.lang.Object writeReplace() throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse)) {
                return super.equals(obj);
            }
            org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse other = (org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse) obj;

            boolean result = true;
            result = result && getRowsList().equals(other.getRowsList());
            result = result && getUnknownFields().equals(other.getUnknownFields());
            return result;
        }

        private int memoizedHashCode = 0;

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptorForType().hashCode();
            if (getRowsCount() > 0) {
                hash = (37 * hash) + ROWS_FIELD_NUMBER;
                hash = (53 * hash) + getRowsList().hashCode();
            }
            hash = (29 * hash) + getUnknownFields().hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse parseFrom(com.google.protobuf.ByteString data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse parseFrom(com.google.protobuf.ByteString data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse parseFrom(java.io.InputStream input) throws java.io.IOException {
            return PARSER.parseFrom(input);
        }

        public static org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse parseFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }

        public static org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse parseDelimitedFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return PARSER.parseFrom(input);
        }

        public static org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse parseFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        /**
         * Protobuf type {@code IIResponse}
         */
        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponseOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.internal_static_IIResponse_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.internal_static_IIResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.class, org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.Builder.class);
            }

            // Construct using org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
                    getRowsFieldBuilder();
                }
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                if (rowsBuilder_ == null) {
                    rows_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000001);
                } else {
                    rowsBuilder_.clear();
                }
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.internal_static_IIResponse_descriptor;
            }

            public org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse getDefaultInstanceForType() {
                return org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.getDefaultInstance();
            }

            public org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse build() {
                org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse buildPartial() {
                org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse result = new org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse(this);
                int from_bitField0_ = bitField0_;
                if (rowsBuilder_ == null) {
                    if (((bitField0_ & 0x00000001) == 0x00000001)) {
                        rows_ = java.util.Collections.unmodifiableList(rows_);
                        bitField0_ = (bitField0_ & ~0x00000001);
                    }
                    result.rows_ = rows_;
                } else {
                    result.rows_ = rowsBuilder_.build();
                }
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse) {
                    return mergeFrom((org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse other) {
                if (other == org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.getDefaultInstance())
                    return this;
                if (rowsBuilder_ == null) {
                    if (!other.rows_.isEmpty()) {
                        if (rows_.isEmpty()) {
                            rows_ = other.rows_;
                            bitField0_ = (bitField0_ & ~0x00000001);
                        } else {
                            ensureRowsIsMutable();
                            rows_.addAll(other.rows_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.rows_.isEmpty()) {
                        if (rowsBuilder_.isEmpty()) {
                            rowsBuilder_.dispose();
                            rowsBuilder_ = null;
                            rows_ = other.rows_;
                            bitField0_ = (bitField0_ & ~0x00000001);
                            rowsBuilder_ = com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ? getRowsFieldBuilder() : null;
                        } else {
                            rowsBuilder_.addAllMessages(other.rows_);
                        }
                    }
                }
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                for (int i = 0; i < getRowsCount(); i++) {
                    if (!getRows(i).isInitialized()) {

                        return false;
                    }
                }
                return true;
            }

            public Builder mergeFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
                org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int bitField0_;

            // repeated .IIResponse.IIRow rows = 1;
            private java.util.List<org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRow> rows_ = java.util.Collections.emptyList();

            private void ensureRowsIsMutable() {
                if (!((bitField0_ & 0x00000001) == 0x00000001)) {
                    rows_ = new java.util.ArrayList<org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRow>(rows_);
                    bitField0_ |= 0x00000001;
                }
            }

            private com.google.protobuf.RepeatedFieldBuilder<org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRow, org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRow.Builder, org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRowOrBuilder> rowsBuilder_;

            /**
             * <code>repeated .IIResponse.IIRow rows = 1;</code>
             */
            public java.util.List<org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRow> getRowsList() {
                if (rowsBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(rows_);
                } else {
                    return rowsBuilder_.getMessageList();
                }
            }

            /**
             * <code>repeated .IIResponse.IIRow rows = 1;</code>
             */
            public int getRowsCount() {
                if (rowsBuilder_ == null) {
                    return rows_.size();
                } else {
                    return rowsBuilder_.getCount();
                }
            }

            /**
             * <code>repeated .IIResponse.IIRow rows = 1;</code>
             */
            public org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRow getRows(int index) {
                if (rowsBuilder_ == null) {
                    return rows_.get(index);
                } else {
                    return rowsBuilder_.getMessage(index);
                }
            }

            /**
             * <code>repeated .IIResponse.IIRow rows = 1;</code>
             */
            public Builder setRows(int index, org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRow value) {
                if (rowsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureRowsIsMutable();
                    rows_.set(index, value);
                    onChanged();
                } else {
                    rowsBuilder_.setMessage(index, value);
                }
                return this;
            }

            /**
             * <code>repeated .IIResponse.IIRow rows = 1;</code>
             */
            public Builder setRows(int index, org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRow.Builder builderForValue) {
                if (rowsBuilder_ == null) {
                    ensureRowsIsMutable();
                    rows_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    rowsBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .IIResponse.IIRow rows = 1;</code>
             */
            public Builder addRows(org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRow value) {
                if (rowsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureRowsIsMutable();
                    rows_.add(value);
                    onChanged();
                } else {
                    rowsBuilder_.addMessage(value);
                }
                return this;
            }

            /**
             * <code>repeated .IIResponse.IIRow rows = 1;</code>
             */
            public Builder addRows(int index, org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRow value) {
                if (rowsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureRowsIsMutable();
                    rows_.add(index, value);
                    onChanged();
                } else {
                    rowsBuilder_.addMessage(index, value);
                }
                return this;
            }

            /**
             * <code>repeated .IIResponse.IIRow rows = 1;</code>
             */
            public Builder addRows(org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRow.Builder builderForValue) {
                if (rowsBuilder_ == null) {
                    ensureRowsIsMutable();
                    rows_.add(builderForValue.build());
                    onChanged();
                } else {
                    rowsBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .IIResponse.IIRow rows = 1;</code>
             */
            public Builder addRows(int index, org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRow.Builder builderForValue) {
                if (rowsBuilder_ == null) {
                    ensureRowsIsMutable();
                    rows_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    rowsBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .IIResponse.IIRow rows = 1;</code>
             */
            public Builder addAllRows(java.lang.Iterable<? extends org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRow> values) {
                if (rowsBuilder_ == null) {
                    ensureRowsIsMutable();
                    super.addAll(values, rows_);
                    onChanged();
                } else {
                    rowsBuilder_.addAllMessages(values);
                }
                return this;
            }

            /**
             * <code>repeated .IIResponse.IIRow rows = 1;</code>
             */
            public Builder clearRows() {
                if (rowsBuilder_ == null) {
                    rows_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000001);
                    onChanged();
                } else {
                    rowsBuilder_.clear();
                }
                return this;
            }

            /**
             * <code>repeated .IIResponse.IIRow rows = 1;</code>
             */
            public Builder removeRows(int index) {
                if (rowsBuilder_ == null) {
                    ensureRowsIsMutable();
                    rows_.remove(index);
                    onChanged();
                } else {
                    rowsBuilder_.remove(index);
                }
                return this;
            }

            /**
             * <code>repeated .IIResponse.IIRow rows = 1;</code>
             */
            public org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRow.Builder getRowsBuilder(int index) {
                return getRowsFieldBuilder().getBuilder(index);
            }

            /**
             * <code>repeated .IIResponse.IIRow rows = 1;</code>
             */
            public org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRowOrBuilder getRowsOrBuilder(int index) {
                if (rowsBuilder_ == null) {
                    return rows_.get(index);
                } else {
                    return rowsBuilder_.getMessageOrBuilder(index);
                }
            }

            /**
             * <code>repeated .IIResponse.IIRow rows = 1;</code>
             */
            public java.util.List<? extends org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRowOrBuilder> getRowsOrBuilderList() {
                if (rowsBuilder_ != null) {
                    return rowsBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(rows_);
                }
            }

            /**
             * <code>repeated .IIResponse.IIRow rows = 1;</code>
             */
            public org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRow.Builder addRowsBuilder() {
                return getRowsFieldBuilder().addBuilder(org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRow.getDefaultInstance());
            }

            /**
             * <code>repeated .IIResponse.IIRow rows = 1;</code>
             */
            public org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRow.Builder addRowsBuilder(int index) {
                return getRowsFieldBuilder().addBuilder(index, org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRow.getDefaultInstance());
            }

            /**
             * <code>repeated .IIResponse.IIRow rows = 1;</code>
             */
            public java.util.List<org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRow.Builder> getRowsBuilderList() {
                return getRowsFieldBuilder().getBuilderList();
            }

            private com.google.protobuf.RepeatedFieldBuilder<org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRow, org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRow.Builder, org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRowOrBuilder> getRowsFieldBuilder() {
                if (rowsBuilder_ == null) {
                    rowsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRow, org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRow.Builder, org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.IIRowOrBuilder>(rows_, ((bitField0_ & 0x00000001) == 0x00000001), getParentForChildren(), isClean());
                    rows_ = null;
                }
                return rowsBuilder_;
            }

            // @@protoc_insertion_point(builder_scope:IIResponse)
        }

        static {
            defaultInstance = new IIResponse(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:IIResponse)
    }

    /**
     * Protobuf service {@code RowsService}
     */
    public static abstract class RowsService implements com.google.protobuf.Service {
        protected RowsService() {
        }

        public interface Interface {
            /**
             * <code>rpc getRows(.IIRequest) returns (.IIResponse);</code>
             */
            public abstract void getRows(com.google.protobuf.RpcController controller, org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIRequest request, com.google.protobuf.RpcCallback<org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse> done);

        }

        public static com.google.protobuf.Service newReflectiveService(final Interface impl) {
            return new RowsService() {
                @java.lang.Override
                public void getRows(com.google.protobuf.RpcController controller, org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIRequest request, com.google.protobuf.RpcCallback<org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse> done) {
                    impl.getRows(controller, request, done);
                }

            };
        }

        public static com.google.protobuf.BlockingService newReflectiveBlockingService(final BlockingInterface impl) {
            return new com.google.protobuf.BlockingService() {
                public final com.google.protobuf.Descriptors.ServiceDescriptor getDescriptorForType() {
                    return getDescriptor();
                }

                public final com.google.protobuf.Message callBlockingMethod(com.google.protobuf.Descriptors.MethodDescriptor method, com.google.protobuf.RpcController controller, com.google.protobuf.Message request) throws com.google.protobuf.ServiceException {
                    if (method.getService() != getDescriptor()) {
                        throw new java.lang.IllegalArgumentException("Service.callBlockingMethod() given method descriptor for " + "wrong service type.");
                    }
                    switch (method.getIndex()) {
                    case 0:
                        return impl.getRows(controller, (org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIRequest) request);
                    default:
                        throw new java.lang.AssertionError("Can't get here.");
                    }
                }

                public final com.google.protobuf.Message getRequestPrototype(com.google.protobuf.Descriptors.MethodDescriptor method) {
                    if (method.getService() != getDescriptor()) {
                        throw new java.lang.IllegalArgumentException("Service.getRequestPrototype() given method " + "descriptor for wrong service type.");
                    }
                    switch (method.getIndex()) {
                    case 0:
                        return org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIRequest.getDefaultInstance();
                    default:
                        throw new java.lang.AssertionError("Can't get here.");
                    }
                }

                public final com.google.protobuf.Message getResponsePrototype(com.google.protobuf.Descriptors.MethodDescriptor method) {
                    if (method.getService() != getDescriptor()) {
                        throw new java.lang.IllegalArgumentException("Service.getResponsePrototype() given method " + "descriptor for wrong service type.");
                    }
                    switch (method.getIndex()) {
                    case 0:
                        return org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.getDefaultInstance();
                    default:
                        throw new java.lang.AssertionError("Can't get here.");
                    }
                }

            };
        }

        /**
         * <code>rpc getRows(.IIRequest) returns (.IIResponse);</code>
         */
        public abstract void getRows(com.google.protobuf.RpcController controller, org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIRequest request, com.google.protobuf.RpcCallback<org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse> done);

        public static final com.google.protobuf.Descriptors.ServiceDescriptor getDescriptor() {
            return org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.getDescriptor().getServices().get(0);
        }

        public final com.google.protobuf.Descriptors.ServiceDescriptor getDescriptorForType() {
            return getDescriptor();
        }

        public final void callMethod(com.google.protobuf.Descriptors.MethodDescriptor method, com.google.protobuf.RpcController controller, com.google.protobuf.Message request, com.google.protobuf.RpcCallback<com.google.protobuf.Message> done) {
            if (method.getService() != getDescriptor()) {
                throw new java.lang.IllegalArgumentException("Service.callMethod() given method descriptor for wrong " + "service type.");
            }
            switch (method.getIndex()) {
            case 0:
                this.getRows(controller, (org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIRequest) request, com.google.protobuf.RpcUtil.<org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse> specializeCallback(done));
                return;
            default:
                throw new java.lang.AssertionError("Can't get here.");
            }
        }

        public final com.google.protobuf.Message getRequestPrototype(com.google.protobuf.Descriptors.MethodDescriptor method) {
            if (method.getService() != getDescriptor()) {
                throw new java.lang.IllegalArgumentException("Service.getRequestPrototype() given method " + "descriptor for wrong service type.");
            }
            switch (method.getIndex()) {
            case 0:
                return org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIRequest.getDefaultInstance();
            default:
                throw new java.lang.AssertionError("Can't get here.");
            }
        }

        public final com.google.protobuf.Message getResponsePrototype(com.google.protobuf.Descriptors.MethodDescriptor method) {
            if (method.getService() != getDescriptor()) {
                throw new java.lang.IllegalArgumentException("Service.getResponsePrototype() given method " + "descriptor for wrong service type.");
            }
            switch (method.getIndex()) {
            case 0:
                return org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.getDefaultInstance();
            default:
                throw new java.lang.AssertionError("Can't get here.");
            }
        }

        public static Stub newStub(com.google.protobuf.RpcChannel channel) {
            return new Stub(channel);
        }

        public static final class Stub extends org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.RowsService implements Interface {
            private Stub(com.google.protobuf.RpcChannel channel) {
                this.channel = channel;
            }

            private final com.google.protobuf.RpcChannel channel;

            public com.google.protobuf.RpcChannel getChannel() {
                return channel;
            }

            public void getRows(com.google.protobuf.RpcController controller, org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIRequest request, com.google.protobuf.RpcCallback<org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse> done) {
                channel.callMethod(getDescriptor().getMethods().get(0), controller, request, org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.getDefaultInstance(), com.google.protobuf.RpcUtil.generalizeCallback(done, org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.class, org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.getDefaultInstance()));
            }
        }

        public static BlockingInterface newBlockingStub(com.google.protobuf.BlockingRpcChannel channel) {
            return new BlockingStub(channel);
        }

        public interface BlockingInterface {
            public org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse getRows(com.google.protobuf.RpcController controller, org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIRequest request) throws com.google.protobuf.ServiceException;
        }

        private static final class BlockingStub implements BlockingInterface {
            private BlockingStub(com.google.protobuf.BlockingRpcChannel channel) {
                this.channel = channel;
            }

            private final com.google.protobuf.BlockingRpcChannel channel;

            public org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse getRows(com.google.protobuf.RpcController controller, org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIRequest request) throws com.google.protobuf.ServiceException {
                return (org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse) channel.callBlockingMethod(getDescriptor().getMethods().get(0), controller, request, org.apache.kylin.storage.hbase.coprocessor.endpoint.generated.IIProtos.IIResponse.getDefaultInstance());
            }

        }

        // @@protoc_insertion_point(class_scope:RowsService)
    }

    private static com.google.protobuf.Descriptors.Descriptor internal_static_IIRequest_descriptor;
    private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_IIRequest_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor internal_static_IIResponse_descriptor;
    private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_IIResponse_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor internal_static_IIResponse_IIRow_descriptor;
    private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_IIResponse_IIRow_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;
    static {
        java.lang.String[] descriptorData = { "\n[storage/src/main/java/org/apache/kylin" + "/storage/hbase/coprocessor/endpoint/prot" + "obuf/II.proto\"P\n\tIIRequest\022\014\n\004type\030\001 \002(\014" + "\022\016\n\006filter\030\002 \002(\014\022\021\n\tprojector\030\003 \002(\014\022\022\n\na" + "ggregator\030\004 \002(\014\"Y\n\nIIResponse\022\037\n\004rows\030\001 " + "\003(\0132\021.IIResponse.IIRow\032*\n\005IIRow\022\017\n\007colum" + "ns\030\001 \002(\014\022\020\n\010measures\030\002 \001(\01421\n\013RowsServic" + "e\022\"\n\007getRows\022\n.IIRequest\032\013.IIResponseBQ\n" + "=org.apache.kylin.storage.hbase.coproces" + "sor.endpoint.generatedB\010IIProtosH\001\210\001\001\240\001\001" };
        com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner = new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
            public com.google.protobuf.ExtensionRegistry assignDescriptors(com.google.protobuf.Descriptors.FileDescriptor root) {
                descriptor = root;
                internal_static_IIRequest_descriptor = getDescriptor().getMessageTypes().get(0);
                internal_static_IIRequest_fieldAccessorTable = new com.google.protobuf.GeneratedMessage.FieldAccessorTable(internal_static_IIRequest_descriptor, new java.lang.String[] { "Type", "Filter", "Projector", "Aggregator", });
                internal_static_IIResponse_descriptor = getDescriptor().getMessageTypes().get(1);
                internal_static_IIResponse_fieldAccessorTable = new com.google.protobuf.GeneratedMessage.FieldAccessorTable(internal_static_IIResponse_descriptor, new java.lang.String[] { "Rows", });
                internal_static_IIResponse_IIRow_descriptor = internal_static_IIResponse_descriptor.getNestedTypes().get(0);
                internal_static_IIResponse_IIRow_fieldAccessorTable = new com.google.protobuf.GeneratedMessage.FieldAccessorTable(internal_static_IIResponse_IIRow_descriptor, new java.lang.String[] { "Columns", "Measures", });
                return null;
            }
        };
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {}, assigner);
    }

    // @@protoc_insertion_point(outer_class_scope)
}
