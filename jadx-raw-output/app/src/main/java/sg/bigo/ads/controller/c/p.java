package sg.bigo.ads.controller.c;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<a> f70706a = new ArrayList();

    public static abstract class a {
        private a() {
        }

        public /* synthetic */ a(byte b10) {
            this();
        }

        public abstract int a();

        public abstract void a(ByteBuffer byteBuffer);
    }

    public final void a(final int i10) {
        this.f70706a.add(new a() { // from class: sg.bigo.ads.controller.c.p.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super((byte) 0);
            }

            @Override // sg.bigo.ads.controller.c.p.a
            public final int a() {
                return 4;
            }

            @Override // sg.bigo.ads.controller.c.p.a
            public final void a(ByteBuffer byteBuffer) {
                byteBuffer.putInt(i10);
            }
        });
    }

    public final void a(String str) {
        this.f70706a.add(new a(str) { // from class: sg.bigo.ads.controller.c.p.1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final byte[] f70707a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f70708b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                byte[] bytes;
                super((byte) 0);
                this.f70708b = str;
                try {
                    bytes = str.getBytes("UTF-8");
                } catch (Exception unused) {
                    bytes = new byte[0];
                }
                this.f70707a = bytes;
            }

            @Override // sg.bigo.ads.controller.c.p.a
            public final int a() {
                return this.f70707a.length + 4;
            }

            @Override // sg.bigo.ads.controller.c.p.a
            public final void a(ByteBuffer byteBuffer) {
                byteBuffer.putInt(this.f70707a.length);
                byteBuffer.put(this.f70707a);
            }
        });
    }
}
