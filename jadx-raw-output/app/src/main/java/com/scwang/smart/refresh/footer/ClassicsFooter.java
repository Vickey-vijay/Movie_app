package com.scwang.smart.refresh.footer;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import cc.c;
import cc.f;
import com.scwang.smart.refresh.classics.ClassicsAbstract;
import com.scwang.smart.refresh.footer.classics.R$id;
import com.scwang.smart.refresh.footer.classics.R$layout;
import com.scwang.smart.refresh.footer.classics.R$string;
import com.scwang.smart.refresh.footer.classics.R$styleable;
import com.scwang.smart.refresh.layout.constant.RefreshState;
import gc.b;

/* JADX INFO: loaded from: classes7.dex */
public class ClassicsFooter extends ClassicsAbstract<ClassicsFooter> implements c {
    public static String C;
    public static String D;
    public static String E;
    public static String F;
    public static String G;
    public static String H;
    public static String I;
    public String A;
    public boolean B;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f45059u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f45060v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f45061w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f45062x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f45063y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f45064z;

    public ClassicsFooter(Context context) {
        this(context, null);
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45065a;

        static {
            int[] iArr = new int[RefreshState.values().length];
            f45065a = iArr;
            try {
                iArr[RefreshState.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45065a[RefreshState.PullUpToLoad.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45065a[RefreshState.Loading.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45065a[RefreshState.LoadReleased.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f45065a[RefreshState.ReleaseToLoad.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f45065a[RefreshState.Refreshing.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public ClassicsFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.B = false;
        View.inflate(context, R$layout.srl_classics_footer, this);
        ImageView imageView = (ImageView) findViewById(R$id.srl_classics_arrow);
        this.f45038f = imageView;
        ImageView imageView2 = (ImageView) findViewById(R$id.srl_classics_progress);
        this.f45039g = imageView2;
        this.f45037e = (TextView) findViewById(R$id.srl_classics_title);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ClassicsFooter);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) imageView2.getLayoutParams();
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ClassicsFooter_srlDrawableMarginRight, b.c(20.0f));
        layoutParams2.rightMargin = dimensionPixelSize;
        layoutParams.rightMargin = dimensionPixelSize;
        int i10 = R$styleable.ClassicsFooter_srlDrawableArrowSize;
        layoutParams.width = typedArrayObtainStyledAttributes.getLayoutDimension(i10, layoutParams.width);
        layoutParams.height = typedArrayObtainStyledAttributes.getLayoutDimension(i10, layoutParams.height);
        int i11 = R$styleable.ClassicsFooter_srlDrawableProgressSize;
        layoutParams2.width = typedArrayObtainStyledAttributes.getLayoutDimension(i11, layoutParams2.width);
        layoutParams2.height = typedArrayObtainStyledAttributes.getLayoutDimension(i11, layoutParams2.height);
        int i12 = R$styleable.ClassicsFooter_srlDrawableSize;
        layoutParams.width = typedArrayObtainStyledAttributes.getLayoutDimension(i12, layoutParams.width);
        layoutParams.height = typedArrayObtainStyledAttributes.getLayoutDimension(i12, layoutParams.height);
        layoutParams2.width = typedArrayObtainStyledAttributes.getLayoutDimension(i12, layoutParams2.width);
        layoutParams2.height = typedArrayObtainStyledAttributes.getLayoutDimension(i12, layoutParams2.height);
        this.f45046n = typedArrayObtainStyledAttributes.getInt(R$styleable.ClassicsFooter_srlFinishDuration, this.f45046n);
        this.f52940c = dc.b.f51934i[typedArrayObtainStyledAttributes.getInt(R$styleable.ClassicsFooter_srlClassicsSpinnerStyle, this.f52940c.f51935a)];
        int i13 = R$styleable.ClassicsFooter_srlDrawableArrow;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            this.f45038f.setImageDrawable(typedArrayObtainStyledAttributes.getDrawable(i13));
        } else if (this.f45038f.getDrawable() == null) {
            bc.a aVar = new bc.a();
            this.f45041i = aVar;
            aVar.a(-10066330);
            this.f45038f.setImageDrawable(this.f45041i);
        }
        int i14 = R$styleable.ClassicsFooter_srlDrawableProgress;
        if (typedArrayObtainStyledAttributes.hasValue(i14)) {
            this.f45039g.setImageDrawable(typedArrayObtainStyledAttributes.getDrawable(i14));
        } else if (this.f45039g.getDrawable() == null) {
            ac.b bVar = new ac.b();
            this.f45042j = bVar;
            bVar.a(-10066330);
            this.f45039g.setImageDrawable(this.f45042j);
        }
        int i15 = R$styleable.ClassicsFooter_srlTextSizeTitle;
        if (typedArrayObtainStyledAttributes.hasValue(i15)) {
            this.f45037e.setTextSize(0, typedArrayObtainStyledAttributes.getDimensionPixelSize(i15, b.c(16.0f)));
        }
        int i16 = R$styleable.ClassicsFooter_srlPrimaryColor;
        if (typedArrayObtainStyledAttributes.hasValue(i16)) {
            super.t(typedArrayObtainStyledAttributes.getColor(i16, 0));
        }
        int i17 = R$styleable.ClassicsFooter_srlAccentColor;
        if (typedArrayObtainStyledAttributes.hasValue(i17)) {
            super.s(typedArrayObtainStyledAttributes.getColor(i17, 0));
        }
        int i18 = R$styleable.ClassicsFooter_srlTextPulling;
        if (typedArrayObtainStyledAttributes.hasValue(i18)) {
            this.f45059u = typedArrayObtainStyledAttributes.getString(i18);
        } else {
            String str = C;
            if (str != null) {
                this.f45059u = str;
            } else {
                this.f45059u = context.getString(R$string.srl_footer_pulling);
            }
        }
        int i19 = R$styleable.ClassicsFooter_srlTextRelease;
        if (typedArrayObtainStyledAttributes.hasValue(i19)) {
            this.f45060v = typedArrayObtainStyledAttributes.getString(i19);
        } else {
            String str2 = D;
            if (str2 != null) {
                this.f45060v = str2;
            } else {
                this.f45060v = context.getString(R$string.srl_footer_release);
            }
        }
        int i20 = R$styleable.ClassicsFooter_srlTextLoading;
        if (typedArrayObtainStyledAttributes.hasValue(i20)) {
            this.f45061w = typedArrayObtainStyledAttributes.getString(i20);
        } else {
            String str3 = E;
            if (str3 != null) {
                this.f45061w = str3;
            } else {
                this.f45061w = context.getString(R$string.srl_footer_loading);
            }
        }
        int i21 = R$styleable.ClassicsFooter_srlTextRefreshing;
        if (typedArrayObtainStyledAttributes.hasValue(i21)) {
            this.f45062x = typedArrayObtainStyledAttributes.getString(i21);
        } else {
            String str4 = F;
            if (str4 != null) {
                this.f45062x = str4;
            } else {
                this.f45062x = context.getString(R$string.srl_footer_refreshing);
            }
        }
        int i22 = R$styleable.ClassicsFooter_srlTextFinish;
        if (typedArrayObtainStyledAttributes.hasValue(i22)) {
            this.f45063y = typedArrayObtainStyledAttributes.getString(i22);
        } else {
            String str5 = G;
            if (str5 != null) {
                this.f45063y = str5;
            } else {
                this.f45063y = context.getString(R$string.srl_footer_finish);
            }
        }
        int i23 = R$styleable.ClassicsFooter_srlTextFailed;
        if (typedArrayObtainStyledAttributes.hasValue(i23)) {
            this.f45064z = typedArrayObtainStyledAttributes.getString(i23);
        } else {
            String str6 = H;
            if (str6 != null) {
                this.f45064z = str6;
            } else {
                this.f45064z = context.getString(R$string.srl_footer_failed);
            }
        }
        int i24 = R$styleable.ClassicsFooter_srlTextNothing;
        if (typedArrayObtainStyledAttributes.hasValue(i24)) {
            this.A = typedArrayObtainStyledAttributes.getString(i24);
        } else {
            String str7 = I;
            if (str7 != null) {
                this.A = str7;
            } else {
                this.A = context.getString(R$string.srl_footer_nothing);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        imageView2.animate().setInterpolator(null);
        this.f45037e.setText(isInEditMode() ? this.f45061w : this.f45059u);
        if (isInEditMode()) {
            imageView.setVisibility(8);
        } else {
            imageView2.setVisibility(8);
        }
    }

    @Override // fc.b, cc.c
    public boolean a(boolean z10) {
        if (this.B == z10) {
            return true;
        }
        this.B = z10;
        ImageView imageView = this.f45038f;
        if (z10) {
            this.f45037e.setText(this.A);
            imageView.setVisibility(8);
            return true;
        }
        this.f45037e.setText(this.f45059u);
        imageView.setVisibility(0);
        return true;
    }

    @Override // fc.b, ec.h
    public void c(@NonNull f fVar, @NonNull RefreshState refreshState, @NonNull RefreshState refreshState2) {
        ImageView imageView = this.f45038f;
        if (this.B) {
            return;
        }
        switch (a.f45065a[refreshState2.ordinal()]) {
            case 1:
                imageView.setVisibility(0);
                break;
            case 2:
                break;
            case 3:
            case 4:
                imageView.setVisibility(8);
                this.f45037e.setText(this.f45061w);
                return;
            case 5:
                this.f45037e.setText(this.f45060v);
                imageView.animate().rotation(0.0f);
                return;
            case 6:
                this.f45037e.setText(this.f45062x);
                imageView.setVisibility(8);
                return;
            default:
                return;
        }
        this.f45037e.setText(this.f45059u);
        imageView.animate().rotation(180.0f);
    }

    @Override // com.scwang.smart.refresh.classics.ClassicsAbstract, fc.b, cc.a
    @Deprecated
    public void setPrimaryColors(@ColorInt int... iArr) {
        if (this.f52940c == dc.b.f51931f) {
            super.setPrimaryColors(iArr);
        }
    }

    @Override // com.scwang.smart.refresh.classics.ClassicsAbstract, fc.b, cc.a
    public int k(@NonNull f fVar, boolean z10) {
        String str;
        super.k(fVar, z10);
        if (!this.B) {
            TextView textView = this.f45037e;
            if (z10) {
                str = this.f45063y;
            } else {
                str = this.f45064z;
            }
            textView.setText(str);
            return this.f45046n;
        }
        return 0;
    }
}
