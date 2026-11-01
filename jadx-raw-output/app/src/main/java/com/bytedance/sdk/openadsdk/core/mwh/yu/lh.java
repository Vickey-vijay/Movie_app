package com.bytedance.sdk.openadsdk.core.mwh.yu;

import com.bykv.vk.openvk.ouw.ouw.vt.lh.yu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class lh extends yu {
    private final ouw zih;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private final List<vt> f12967rn = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public int f12965jg = 1;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public int f12966ko = 1;

    public class ouw implements com.bykv.vk.openvk.ouw.ouw.ouw.ouw.InterfaceC0060ouw {
        private ouw() {
        }

        @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw.InterfaceC0060ouw
        public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.ouw ouwVar) {
            lh.ouw(lh.this);
            if (lh.this.f12966ko > lh.this.f12965jg) {
                Iterator it = lh.this.f12967rn.iterator();
                while (it.hasNext()) {
                    ((vt) it.next()).ouw(ouwVar);
                }
                return;
            }
            for (vt vtVar : lh.this.f12967rn) {
                int unused = lh.this.f12966ko;
                int unused2 = lh.this.f12965jg;
                vtVar.ouw();
            }
            lh.this.ryl();
        }

        @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw.InterfaceC0060ouw
        public final void vt(com.bykv.vk.openvk.ouw.ouw.ouw.ouw ouwVar) {
            Iterator it = lh.this.f12967rn.iterator();
            while (it.hasNext()) {
                ((vt) it.next()).vt(ouwVar);
            }
        }

        public /* synthetic */ ouw(lh lhVar, byte b10) {
            this();
        }

        @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw.InterfaceC0060ouw
        public final void fkw(com.bykv.vk.openvk.ouw.ouw.ouw.ouw ouwVar) {
            Iterator it = lh.this.f12967rn.iterator();
            while (it.hasNext()) {
                ((vt) it.next()).fkw(ouwVar);
            }
        }

        @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw.InterfaceC0060ouw
        public final void lh(com.bykv.vk.openvk.ouw.ouw.ouw.ouw ouwVar) {
            Iterator it = lh.this.f12967rn.iterator();
            while (it.hasNext()) {
                ((vt) it.next()).lh(ouwVar);
            }
        }

        @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw.InterfaceC0060ouw
        public final void yu(com.bykv.vk.openvk.ouw.ouw.ouw.ouw ouwVar) {
            Iterator it = lh.this.f12967rn.iterator();
            while (it.hasNext()) {
                ((vt) it.next()).yu(ouwVar);
            }
        }

        @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw.InterfaceC0060ouw
        public final void vt(com.bykv.vk.openvk.ouw.ouw.ouw.ouw ouwVar, int i10) {
            Iterator it = lh.this.f12967rn.iterator();
            while (it.hasNext()) {
                ((vt) it.next()).vt(ouwVar, i10);
            }
        }

        @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw.InterfaceC0060ouw
        public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.ouw ouwVar, long j10) {
            Iterator it = lh.this.f12967rn.iterator();
            while (it.hasNext()) {
                ((vt) it.next()).ouw(ouwVar, j10);
            }
        }

        @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw.InterfaceC0060ouw
        public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.ouw ouwVar, com.bykv.vk.openvk.ouw.ouw.ouw.lh.ouw ouwVar2) {
            Iterator it = lh.this.f12967rn.iterator();
            while (it.hasNext()) {
                ((vt) it.next()).ouw(ouwVar, ouwVar2);
            }
        }

        @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw.InterfaceC0060ouw
        public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.ouw ouwVar, boolean z10) {
            Iterator it = lh.this.f12967rn.iterator();
            while (it.hasNext()) {
                ((vt) it.next()).ouw(ouwVar, z10);
            }
        }

        @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw.InterfaceC0060ouw
        public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.ouw ouwVar, int i10, int i11) {
            Iterator it = lh.this.f12967rn.iterator();
            while (it.hasNext()) {
                ((vt) it.next()).ouw(ouwVar, i10, i11);
            }
        }

        @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw.InterfaceC0060ouw
        public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.ouw ouwVar, int i10, int i11, int i12) {
            Iterator it = lh.this.f12967rn.iterator();
            while (it.hasNext()) {
                ((vt) it.next()).ouw(ouwVar, i10, i11, i12);
            }
        }

        @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw.InterfaceC0060ouw
        public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.ouw ouwVar, int i10) {
            Iterator it = lh.this.f12967rn.iterator();
            while (it.hasNext()) {
                ((vt) it.next()).ouw(ouwVar, i10);
            }
        }

        @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw.InterfaceC0060ouw
        public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.ouw ouwVar, long j10, long j11) {
            Iterator it = lh.this.f12967rn.iterator();
            while (it.hasNext()) {
                ((vt) it.next()).ouw(ouwVar, j10, j11);
            }
        }
    }

    public interface vt extends com.bykv.vk.openvk.ouw.ouw.ouw.ouw.InterfaceC0060ouw {
        void ouw();
    }

    public static /* synthetic */ int ouw(lh lhVar) {
        int i10 = lhVar.f12966ko;
        lhVar.f12966ko = i10 + 1;
        return i10;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.vt.lh.yu
    public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.ouw.InterfaceC0060ouw interfaceC0060ouw) {
        if (!(interfaceC0060ouw instanceof vt)) {
            super.ouw(interfaceC0060ouw);
        } else {
            if (this.f12967rn.contains(interfaceC0060ouw)) {
                return;
            }
            this.f12967rn.add((vt) interfaceC0060ouw);
        }
    }

    public lh() {
        ouw ouwVar = new ouw(this, (byte) 0);
        this.zih = ouwVar;
        super.ouw(ouwVar);
        zih();
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.vt.lh.yu
    public final long ko() {
        return super.ko() * ((long) this.f12965jg);
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.vt.lh.yu
    public final long rn() {
        long jRn = super.rn();
        if (this.f12965jg == 1) {
            return jRn;
        }
        return jRn + (((long) (this.f12966ko - 1)) * super.ko());
    }
}
