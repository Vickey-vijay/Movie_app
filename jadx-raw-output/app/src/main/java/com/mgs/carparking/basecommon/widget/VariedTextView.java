package com.mgs.carparking.basecommon.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatTextView;
import com.mgs.carparking.R$styleable;

/* JADX INFO: loaded from: classes11.dex */
public class VariedTextView extends AppCompatTextView implements k9.b.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f39722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k9.a f39723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f39724d;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static Typeface f39725a;

        public static synchronized Typeface a(Context context) {
            if (f39725a == null) {
                try {
                    f39725a = Typeface.createFromAsset(context.getAssets(), "iconfont.ttf");
                } catch (Exception unused) {
                }
            }
            return f39725a;
        }
    }

    public VariedTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(context, attributeSet);
    }

    public static class b extends k9.b {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public VariedTextView f39726o;

        public b(VariedTextView variedTextView) {
            this.f39726o = variedTextView;
        }
    }

    public void a() {
        b bVar = this.f39722b;
        if (bVar != null) {
            setShape(bVar);
        }
    }

    public final void c(Context context, AttributeSet attributeSet) {
        this.f39724d = context;
        b bVar = new b(this);
        this.f39722b = bVar;
        setTypeface(a.a(getContext()));
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = null;
            try {
                typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.VariedTextView);
                bVar.f62652b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(12, 0);
                bVar.f62653c = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 0);
                bVar.f62654d = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
                bVar.f62655e = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0);
                bVar.f62656f = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
                bVar.f62661k = d(typedArrayObtainStyledAttributes.getInt(2, 0));
                bVar.f62657g = typedArrayObtainStyledAttributes.getColor(10, -1);
                bVar.f62658h = typedArrayObtainStyledAttributes.getDimensionPixelOffset(11, 0);
                bVar.f62659i = typedArrayObtainStyledAttributes.getColor(8, -1);
                bVar.f62660j = typedArrayObtainStyledAttributes.getInteger(7, 0);
                a();
            } catch (Exception unused) {
            } finally {
                if (typedArrayObtainStyledAttributes != null) {
                    typedArrayObtainStyledAttributes.recycle();
                }
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z10) {
        k9.a aVar = this.f39723c;
        if (aVar != null && z10) {
            if (aVar.b() != null) {
                setShape(this.f39723c.b());
            } else if (this.f39723c.c() != null) {
                setShape(this.f39723c.c());
            }
        }
        super.setEnabled(z10);
    }

    @Override // android.widget.TextView, android.view.View
    public void setSelected(boolean z10) {
        k9.a aVar = this.f39723c;
        if (aVar != null) {
            if (z10) {
                if (aVar.a() != null) {
                    setShape(this.f39723c.a());
                } else if (this.f39723c.b() != null) {
                    setShape(this.f39723c.b());
                }
            } else if (aVar.b() != null) {
                setShape(this.f39723c.b());
            }
        }
        super.setSelected(z10);
    }

    public VariedTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        c(context, attributeSet);
    }

    private void setShape(k9.b bVar) {
        l9.a aVarE;
        if (bVar.f() != 0.0f) {
            aVarE = l9.a.i().f(bVar.getType()).j(bVar.f()).e(bVar.j(), bVar.i());
        } else {
            aVarE = l9.a.i().f(bVar.getType()).d(bVar.k(), bVar.l(), bVar.a(), bVar.b()).e(bVar.j(), bVar.i());
        }
        if (bVar.e() != null && bVar.h() != null && bVar.d() != null) {
            if (bVar.c() != null) {
                aVarE.a(bVar.e(), b(bVar.h()), b(bVar.c()), b(bVar.d()));
            } else {
                aVarE.c(bVar.e(), b(bVar.h()), b(bVar.d()));
            }
        } else {
            aVarE.k(bVar.g());
        }
        aVarE.h(this);
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom() + 1);
    }

    public final int b(ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), 0);
    }

    public final GradientDrawable.Orientation d(int i10) {
        switch (i10) {
            case 0:
                return GradientDrawable.Orientation.TOP_BOTTOM;
            case 1:
                return GradientDrawable.Orientation.TR_BL;
            case 2:
                return GradientDrawable.Orientation.RIGHT_LEFT;
            case 3:
                return GradientDrawable.Orientation.BR_TL;
            case 4:
                return GradientDrawable.Orientation.BOTTOM_TOP;
            case 5:
                return GradientDrawable.Orientation.BL_TR;
            case 6:
                return GradientDrawable.Orientation.LEFT_RIGHT;
            case 7:
                return GradientDrawable.Orientation.TL_BR;
            default:
                return GradientDrawable.Orientation.LEFT_RIGHT;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getAction();
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        k9.a aVar;
        super.onWindowVisibilityChanged(i10);
        if (i10 == 0) {
            k9.a aVar2 = this.f39723c;
            if (aVar2 != null && aVar2.a() != null) {
                this.f39723c.a().m(this);
                return;
            }
            return;
        }
        if ((i10 == 4 || i10 == 8) && (aVar = this.f39723c) != null && aVar.a() != null) {
            this.f39723c.a().m(null);
        }
    }
}
