package fc;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import cc.c;
import cc.d;
import cc.e;
import cc.f;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import com.scwang.smart.refresh.layout.constant.RefreshState;

/* JADX INFO: compiled from: SimpleComponent.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b extends RelativeLayout implements cc.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f52939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public dc.b f52940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public cc.a f52941d;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@NonNull View view) {
        this(view, view instanceof cc.a ? (cc.a) view : null);
    }

    public b(@NonNull View view, @Nullable cc.a aVar) {
        super(view.getContext(), null, 0);
        this.f52939b = view;
        this.f52941d = aVar;
        if ((this instanceof c) && (aVar instanceof d) && aVar.getSpinnerStyle() == dc.b.f51933h) {
            aVar.getView().setScaleY(-1.0f);
            return;
        }
        if (this instanceof d) {
            cc.a aVar2 = this.f52941d;
            if ((aVar2 instanceof c) && aVar2.getSpinnerStyle() == dc.b.f51933h) {
                aVar.getView().setScaleY(-1.0f);
            }
        }
    }

    @SuppressLint({"RestrictedApi"})
    public boolean a(boolean z10) {
        cc.a aVar = this.f52941d;
        return (aVar instanceof c) && ((c) aVar).a(z10);
    }

    public void c(@NonNull f fVar, @NonNull RefreshState refreshState, @NonNull RefreshState refreshState2) {
        cc.a aVar = this.f52941d;
        if (aVar == null || aVar == this) {
            return;
        }
        if ((this instanceof c) && (aVar instanceof d)) {
            if (refreshState.isFooter) {
                refreshState = refreshState.toHeader();
            }
            if (refreshState2.isFooter) {
                refreshState2 = refreshState2.toHeader();
            }
        } else if ((this instanceof d) && (aVar instanceof c)) {
            if (refreshState.isHeader) {
                refreshState = refreshState.toFooter();
            }
            if (refreshState2.isHeader) {
                refreshState2 = refreshState2.toFooter();
            }
        }
        cc.a aVar2 = this.f52941d;
        if (aVar2 != null) {
            aVar2.c(fVar, refreshState, refreshState2);
        }
    }

    @Override // cc.a
    public void d(float f10, int i10, int i11) {
        cc.a aVar = this.f52941d;
        if (aVar == null || aVar == this) {
            return;
        }
        aVar.d(f10, i10, i11);
    }

    @Override // cc.a
    public boolean e() {
        cc.a aVar = this.f52941d;
        return (aVar == null || aVar == this || !aVar.e()) ? false : true;
    }

    @Override // cc.a
    @NonNull
    public dc.b getSpinnerStyle() {
        int i10;
        dc.b bVar = this.f52940c;
        if (bVar != null) {
            return bVar;
        }
        cc.a aVar = this.f52941d;
        if (aVar != null && aVar != this) {
            return aVar.getSpinnerStyle();
        }
        View view = this.f52939b;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof SmartRefreshLayout.LayoutParams) {
                dc.b bVar2 = ((SmartRefreshLayout.LayoutParams) layoutParams).f45125b;
                this.f52940c = bVar2;
                if (bVar2 != null) {
                    return bVar2;
                }
            }
            if (layoutParams != null && ((i10 = layoutParams.height) == 0 || i10 == -1)) {
                for (dc.b bVar3 : dc.b.f51934i) {
                    if (bVar3.f51937c) {
                        this.f52940c = bVar3;
                        return bVar3;
                    }
                }
            }
        }
        dc.b bVar4 = dc.b.f51929d;
        this.f52940c = bVar4;
        return bVar4;
    }

    @Override // cc.a
    @NonNull
    public View getView() {
        View view = this.f52939b;
        return view == null ? this : view;
    }

    public void h(@NonNull e eVar, int i10, int i11) {
        cc.a aVar = this.f52941d;
        if (aVar != null && aVar != this) {
            aVar.h(eVar, i10, i11);
            return;
        }
        View view = this.f52939b;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof SmartRefreshLayout.LayoutParams) {
                eVar.b(this, ((SmartRefreshLayout.LayoutParams) layoutParams).f45124a);
            }
        }
    }

    public void j(@NonNull f fVar, int i10, int i11) {
        cc.a aVar = this.f52941d;
        if (aVar == null || aVar == this) {
            return;
        }
        aVar.j(fVar, i10, i11);
    }

    public int k(@NonNull f fVar, boolean z10) {
        cc.a aVar = this.f52941d;
        if (aVar == null || aVar == this) {
            return 0;
        }
        return aVar.k(fVar, z10);
    }

    public void n(@NonNull f fVar, int i10, int i11) {
        cc.a aVar = this.f52941d;
        if (aVar == null || aVar == this) {
            return;
        }
        aVar.n(fVar, i10, i11);
    }

    public void q(boolean z10, float f10, int i10, int i11, int i12) {
        cc.a aVar = this.f52941d;
        if (aVar == null || aVar == this) {
            return;
        }
        aVar.q(z10, f10, i10, i11, i12);
    }

    public void setPrimaryColors(@ColorInt int... iArr) {
        cc.a aVar = this.f52941d;
        if (aVar == null || aVar == this) {
            return;
        }
        aVar.setPrimaryColors(iArr);
    }

    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return true;
        }
        if ((obj instanceof cc.a) && getView() == ((cc.a) obj).getView()) {
            return true;
        }
        return false;
    }

    public b(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
