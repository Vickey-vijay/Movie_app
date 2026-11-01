package sg.bigo.ads.ad.interstitial;

import android.webkit.ValueCallback;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f68104a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f68105b = -14671580;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WeakHashMap<TextView, d> f68107d = new WeakHashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final WeakHashMap<ValueCallback<Double>, d> f68108e = new WeakHashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double f68109f = Double.NaN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f68106c = f68105b;

    public interface a {
        int a();
    }

    public static void a(@NonNull TextView textView, double d10) {
        if (textView == null) {
            return;
        }
        textView.setTextColor(d10 <= 3.0d ? f68105b : f68104a);
    }

    public static void a(@NonNull TextView textView, int i10) {
        if (textView == null) {
            return;
        }
        a(textView, sg.bigo.ads.common.w.b.a(i10));
    }

    public static void a(@NonNull final TextView textView, int i10, @Nullable final sg.bigo.ads.common.w.b.a aVar) {
        if (textView == null) {
            return;
        }
        sg.bigo.ads.common.w.b.a(textView, i10, new sg.bigo.ads.common.w.b.a() { // from class: sg.bigo.ads.ad.interstitial.d.1
            @Override // sg.bigo.ads.common.w.b.a
            public final long a() {
                sg.bigo.ads.common.w.b.a aVar2 = aVar;
                if (aVar2 != null) {
                    return aVar2.a();
                }
                return 0L;
            }

            @Override // sg.bigo.ads.common.w.b.a
            public final boolean a(int i11) {
                d.a(textView, sg.bigo.ads.common.w.b.a(i11));
                sg.bigo.ads.common.w.b.a aVar2 = aVar;
                if (aVar2 == null) {
                    return false;
                }
                aVar2.a(i11);
                return false;
            }

            @Override // sg.bigo.ads.common.w.b.a
            public final void b(int i11) {
                sg.bigo.ads.common.w.b.a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.b(i11);
                }
            }
        });
    }

    public static void b(@NonNull TextView textView, int i10) {
        a(textView, i10, null);
    }

    public final int a(int i10) {
        int iB = sg.bigo.ads.common.w.b.b(i10);
        this.f68109f = sg.bigo.ads.common.w.b.a(iB);
        Iterator<Map.Entry<TextView, d>> it = this.f68107d.entrySet().iterator();
        while (it.hasNext()) {
            TextView key = it.next().getKey();
            if (key != null) {
                a(key, this.f68109f);
                this.f68106c = this.f68109f <= 3.0d ? f68105b : f68104a;
            }
        }
        Iterator<Map.Entry<ValueCallback<Double>, d>> it2 = this.f68108e.entrySet().iterator();
        while (it2.hasNext()) {
            ValueCallback<Double> key2 = it2.next().getKey();
            if (key2 != null) {
                key2.onReceiveValue(Double.valueOf(this.f68109f));
            }
        }
        return iB;
    }

    public final void a(ValueCallback<Double> valueCallback) {
        if (valueCallback == null) {
            return;
        }
        this.f68108e.put(valueCallback, this);
        double d10 = this.f68109f;
        if (d10 != Double.MIN_VALUE) {
            valueCallback.onReceiveValue(Double.valueOf(d10));
        }
    }

    public final void a(TextView textView) {
        if (textView == null) {
            return;
        }
        this.f68107d.remove(textView);
    }

    public final void b(TextView textView) {
        if (textView == null) {
            return;
        }
        this.f68107d.put(textView, this);
        double d10 = this.f68109f;
        if (d10 != Double.NaN) {
            a(textView, d10);
        }
    }
}
