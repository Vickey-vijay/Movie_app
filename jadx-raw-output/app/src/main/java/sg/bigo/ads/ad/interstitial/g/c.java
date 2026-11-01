package sg.bigo.ads.ad.interstitial.g;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.core.view.ViewCompat;
import io.bidmachine.media3.ui.DefaultTimeBar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, Integer> f68522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, Integer> f68523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<String> f68524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f68525d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f68526e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Paint f68527f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Paint f68528g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f68529h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f68530i;

    public c(Context context) {
        this(context, (byte) 0);
    }

    private c(Context context, byte b10) {
        this(context, (char) 0);
    }

    private c(Context context, char c10) {
        super(context, null, 0);
        this.f68522a = new HashMap();
        this.f68523b = new HashMap();
        this.f68524c = new ArrayList();
        this.f68525d = null;
        this.f68526e = 1;
        this.f68529h = sg.bigo.ads.common.utils.e.a(context, 2);
        this.f68530i = sg.bigo.ads.common.utils.e.a(context, 8);
        this.f68527f = new Paint(1);
        this.f68528g = new Paint(1);
        a();
    }

    private void a() {
        Paint paint;
        int i10;
        if (this.f68526e == 1) {
            this.f68527f.setColor(-1);
            paint = this.f68528g;
            i10 = DefaultTimeBar.DEFAULT_UNPLAYED_COLOR;
        } else {
            this.f68527f.setColor(ViewCompat.MEASURED_STATE_MASK);
            paint = this.f68528g;
            i10 = 855638016;
        }
        paint.setColor(i10);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f68522a.isEmpty()) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int i10 = this.f68529h;
        int i11 = (height - i10) / 2;
        int i12 = i10 + i11;
        int size = this.f68522a.size();
        if (size == 0) {
            return;
        }
        int i13 = (width - ((size - 1) * this.f68530i)) / size;
        int i14 = 0;
        for (String str : this.f68524c) {
            Integer num = this.f68522a.get(str);
            Integer num2 = this.f68523b.get(str);
            if (num != null && num2 != null && num.intValue() > 0) {
                int i15 = (this.f68530i + i13) * i14;
                int i16 = 0;
                while (i16 < num.intValue()) {
                    int iIntValue = i13 / num.intValue();
                    int i17 = (i16 * iIntValue) + i15;
                    canvas.drawRect(i17, i11, i16 == num.intValue() + (-1) ? i15 + i13 : iIntValue + i17, i12, i16 < num2.intValue() ? this.f68527f : this.f68528g);
                    i16++;
                }
                i14++;
            }
        }
    }

    public final void setStyleType$2563266(int i10) {
        this.f68526e = i10;
        a();
        invalidate();
    }

    public final void setTotalNum(Map<String, Integer> map) {
        this.f68522a.clear();
        this.f68523b.clear();
        this.f68524c.clear();
        this.f68525d = null;
        if (map != null) {
            this.f68522a.putAll(map);
            this.f68524c.addAll(map.keySet());
            Iterator<String> it = map.keySet().iterator();
            while (it.hasNext()) {
                this.f68523b.put(it.next(), 0);
            }
        }
    }
}
