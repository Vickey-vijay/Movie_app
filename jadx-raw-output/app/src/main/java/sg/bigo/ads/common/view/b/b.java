package sg.bigo.ads.common.view.b;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(api = 21)
public final class b extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f70252a;

    public b() {
        this(Float.NaN);
    }

    public b(float f10) {
        this.f70252a = f10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Path clipPath;
        if (!(view instanceof a) || (clipPath = ((a) view).getClipPath()) == null) {
            if (Float.isNaN(this.f70252a)) {
                return;
            }
            Drawable background = view.getBackground();
            outline.setRoundRect(background != null ? background.getBounds() : new Rect(view.getPaddingLeft(), view.getPaddingTop(), view.getWidth() - view.getPaddingRight(), view.getHeight() - view.getPaddingBottom()), this.f70252a);
            return;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            outline.setPath(clipPath);
        } else {
            outline.setConvexPath(clipPath);
        }
    }
}
