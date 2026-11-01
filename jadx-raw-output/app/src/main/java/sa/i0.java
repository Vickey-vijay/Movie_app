package sa;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: SoftKeyboardStateWatcher.java */
/* JADX INFO: loaded from: classes7.dex */
public class i0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<a> f67152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f67153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f67154d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f67155e;

    /* JADX INFO: compiled from: SoftKeyboardStateWatcher.java */
    public interface a {
        void onSoftKeyboardClosed();

        void onSoftKeyboardOpened(int i10);
    }

    public i0(View view) {
        this(view, false);
    }

    public i0(View view, boolean z10) {
        this.f67152b = new LinkedList();
        this.f67153c = view;
        this.f67155e = z10;
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    public void a(a aVar) {
        this.f67152b.add(aVar);
    }

    public final void b() {
        for (a aVar : this.f67152b) {
            if (aVar != null) {
                aVar.onSoftKeyboardClosed();
            }
        }
    }

    public final void c(int i10) {
        this.f67154d = i10;
        for (a aVar : this.f67152b) {
            if (aVar != null) {
                aVar.onSoftKeyboardOpened(i10);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        Rect rect = new Rect();
        this.f67153c.getWindowVisibleDisplayFrame(rect);
        int height = this.f67153c.getRootView().getHeight() - (rect.bottom - rect.top);
        if (!this.f67155e && height > this.f67153c.getRootView().getHeight() / 5) {
            this.f67155e = true;
            c(height);
        } else {
            if (!this.f67155e || height >= this.f67153c.getRootView().getHeight() / 5) {
                return;
            }
            this.f67155e = false;
            b();
        }
    }
}
