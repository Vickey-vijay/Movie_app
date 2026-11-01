package com.liulishuo.filedownloader.message;

import w7.f;

/* JADX INFO: loaded from: classes9.dex */
public interface BlockCompleteMessage {

    public static class BlockCompleteMessageImpl extends MessageSnapshot implements BlockCompleteMessage {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final MessageSnapshot f31870d;

        @Override // s7.b
        public byte getStatus() {
            return (byte) 4;
        }

        @Override // com.liulishuo.filedownloader.message.BlockCompleteMessage
        public MessageSnapshot d() {
            return this.f31870d;
        }

        public BlockCompleteMessageImpl(MessageSnapshot messageSnapshot) {
            super(messageSnapshot.g());
            if (messageSnapshot.getStatus() == -3) {
                this.f31870d = messageSnapshot;
                return;
            }
            throw new IllegalArgumentException(f.o("can't create the block complete message for id[%d], status[%d]", Integer.valueOf(messageSnapshot.g()), Byte.valueOf(messageSnapshot.getStatus())));
        }
    }

    MessageSnapshot d();
}
