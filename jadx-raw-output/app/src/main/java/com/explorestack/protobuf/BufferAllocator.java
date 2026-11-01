package com.explorestack.protobuf;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
abstract class BufferAllocator {
    private static final BufferAllocator UNPOOLED = new BufferAllocator() { // from class: com.explorestack.protobuf.BufferAllocator.1
        @Override // com.explorestack.protobuf.BufferAllocator
        public AllocatedBuffer allocateHeapBuffer(int i10) {
            return AllocatedBuffer.wrap(new byte[i10]);
        }

        @Override // com.explorestack.protobuf.BufferAllocator
        public AllocatedBuffer allocateDirectBuffer(int i10) {
            return AllocatedBuffer.wrap(ByteBuffer.allocateDirect(i10));
        }
    };

    public abstract AllocatedBuffer allocateDirectBuffer(int i10);

    public abstract AllocatedBuffer allocateHeapBuffer(int i10);

    public static BufferAllocator unpooled() {
        return UNPOOLED;
    }
}
