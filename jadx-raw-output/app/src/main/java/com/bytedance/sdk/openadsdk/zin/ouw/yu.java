package com.bytedance.sdk.openadsdk.zin.ouw;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.widget.FrameLayout;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.pno.pno;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.uoy;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class yu {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private static volatile yu f13625lh;
    public final Handler ouw;
    private int yu = 0;
    private int fkw = 2;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private int f13626le = 3600000;
    public final ArrayList<vt> vt = new ArrayList<>();

    private yu() {
        bs.vt(new pno("pag_pre_render_init") { // from class: com.bytedance.sdk.openadsdk.zin.ouw.yu.1
            @Override // java.lang.Runnable
            public final void run() {
                yu.this.yu = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("plb_pre_render_enable", 0);
                yu.this.fkw = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("plb_pre_render_max_count", 2);
                if (yu.this.fkw <= 0 || yu.this.fkw > 4) {
                    yu.this.fkw = 2;
                }
                yu.this.f13626le = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("plb_pre_render_alive_time", 3600000);
                if (yu.this.f13626le <= 0 || yu.this.f13626le > 3600000) {
                    yu.this.f13626le = 3600000;
                }
            }
        });
        this.ouw = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.bytedance.sdk.openadsdk.zin.ouw.yu.2
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(@NonNull Message message) {
                if (!(message.obj instanceof vt)) {
                    return false;
                }
                yu.this.vt.remove(message.obj);
                ((vt) message.obj).yu();
                return true;
            }
        });
    }

    public static yu ouw() {
        if (f13625lh == null) {
            synchronized (yu.class) {
                if (f13625lh == null) {
                    f13625lh = new yu();
                }
            }
        }
        return f13625lh;
    }

    public final boolean vt() {
        return this.yu == 1;
    }

    @MainThread
    public final void ouw(@Nullable final vpp vppVar) {
        if (vt() && vppVar != null && od.le(vppVar)) {
            final String strUx = vppVar.ux();
            if (TextUtils.isEmpty(strUx)) {
                return;
            }
            bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.zin.ouw.yu.3
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        if (yu.this.vt.size() >= yu.this.fkw) {
                            ko.ouw("PlayablePreRenderManager", "inUse size is : ", Integer.valueOf(yu.this.vt.size()), ", recycle last old plb");
                            vt vtVar = (vt) yu.this.vt.remove(0);
                            if (vtVar != null) {
                                yu.this.ouw.removeMessages(vtVar.zin.hashCode());
                                vtVar.yu();
                            }
                        }
                        vppVar.kn();
                        Context contextOuw = zih.ouw();
                        vpp vppVar2 = vppVar;
                        final vt vtVar2 = new vt(contextOuw, vppVar2, vppVar2.jqy(), new FrameLayout(zih.ouw()), strUx);
                        yu.this.vt.add(vtVar2);
                        vtVar2.le();
                        Message messageObtain = Message.obtain();
                        messageObtain.what = strUx.hashCode();
                        messageObtain.obj = vtVar2;
                        yu.this.ouw.sendMessageDelayed(messageObtain, yu.this.f13626le);
                        vtVar2.mwh = new ouw.vt() { // from class: com.bytedance.sdk.openadsdk.zin.ouw.yu.3.1
                            @Override // com.bytedance.sdk.openadsdk.zin.ouw.ouw.vt
                            public final void ouw() {
                                ko.vt("PlayablePreRenderManager", "playable is backup");
                                yu.this.ouw.removeMessages(strUx.hashCode());
                                yu.this.vt.remove(vtVar2);
                                vtVar2.yu();
                            }
                        };
                        vpp vppVar3 = vppVar;
                        com.bytedance.sdk.openadsdk.yu.lh.ouw(vppVar3, uoy.lh(vppVar3.yiz.getDurationSlotType()), "PL_start_pre_render");
                    } catch (Throwable th2) {
                        ko.ouw("PlayablePreRenderManager", "preRenderPlayable exception is ", th2.getMessage());
                    }
                }
            });
        }
    }
}
