package sg.bigo.ads.common.c;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes11.dex */
@TargetApi(17)
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f69497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RenderScript f69498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ScriptIntrinsicBlur f69499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Allocation f69500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Allocation f69501e;

    @RequiresApi(api = 17)
    public b(Context context) {
        this.f69497a = context;
    }

    private boolean b() {
        return (this.f69498b == null || this.f69499c == null) ? false : true;
    }

    @Override // sg.bigo.ads.common.c.a
    public final void a() {
        ScriptIntrinsicBlur scriptIntrinsicBlur = this.f69499c;
        if (scriptIntrinsicBlur != null) {
            scriptIntrinsicBlur.destroy();
            this.f69499c = null;
        }
        RenderScript renderScript = this.f69498b;
        if (renderScript != null) {
            renderScript.destroy();
            this.f69498b = null;
        }
        Allocation allocation = this.f69500d;
        if (allocation != null) {
            allocation.destroy();
            this.f69500d = null;
        }
        Allocation allocation2 = this.f69501e;
        if (allocation2 != null) {
            allocation2.destroy();
            this.f69501e = null;
        }
    }

    @Override // sg.bigo.ads.common.c.a
    public final void a(Bitmap bitmap, Bitmap bitmap2) {
        if (b()) {
            if (this.f69500d == null) {
                this.f69500d = Allocation.createFromBitmap(this.f69498b, bitmap);
            }
            if (this.f69501e == null) {
                this.f69501e = Allocation.createFromBitmap(this.f69498b, bitmap2);
            }
            this.f69500d.copyFrom(bitmap);
            this.f69499c.setInput(this.f69500d);
            this.f69499c.forEach(this.f69501e);
            this.f69501e.copyTo(bitmap2);
        }
    }

    public final boolean a(float f10) {
        if (!b()) {
            try {
                RenderScript renderScriptCreate = RenderScript.create(this.f69497a);
                this.f69498b = renderScriptCreate;
                this.f69499c = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
            } catch (Exception unused) {
                a();
                return false;
            }
        }
        this.f69499c.setRadius(f10);
        return true;
    }

    @Override // sg.bigo.ads.common.c.a
    public final boolean a(Bitmap bitmap, float f10) {
        if (!a(f10)) {
            return false;
        }
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(this.f69498b, bitmap, Allocation.MipmapControl.MIPMAP_NONE, 1);
        this.f69500d = allocationCreateFromBitmap;
        this.f69501e = Allocation.createTyped(this.f69498b, allocationCreateFromBitmap.getType());
        return true;
    }
}
