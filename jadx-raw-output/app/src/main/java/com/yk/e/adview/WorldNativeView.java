package com.yk.e.adview;

import android.app.Activity;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.yk.e.object.WorldNativeImgParams;
import com.yk.e.object.WorldNativeLyParams;
import com.yk.e.object.WorldNativeTagParams;
import com.yk.e.object.WorldNativeTvParams;
import com.yk.e.util.AdLog;
import com.yk.e.util.IDUtil;
import com.yk.e.util.LogUtil;
import d.n;
import d.o;
import e.e0;
import i.g;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class WorldNativeView extends LinearLayout {
    public final ArrayList I11L;
    public WorldNativeLyParams I11li1;
    public final ImageView I1I;
    public final Activity IL1Iii;
    public final TextView ILL;
    public final View ILil;

    /* JADX INFO: renamed from: IL丨丨l, reason: contains not printable characters */
    public final TextView f3343ILl;
    public final LinearLayout Ilil;

    /* JADX INFO: renamed from: I丨L, reason: contains not printable characters */
    public final RoundRectImageView f3344IL;

    /* JADX INFO: renamed from: I丨iL, reason: contains not printable characters */
    public final RelativeLayout f3345IiL;

    /* JADX INFO: renamed from: Lil, reason: collision with root package name */
    public WorldNativeTvParams f51170Lil;
    public WorldNativeTvParams LlLI1;

    /* JADX INFO: renamed from: Ll丨1, reason: contains not printable characters */
    public final TextView f3346Ll1;

    /* JADX INFO: renamed from: L丨1丨1丨I, reason: contains not printable characters */
    public final TextView f3347L11I;
    public WorldNativeLyParams iIi1;
    public WorldNativeLyParams iIlLiL;

    /* JADX INFO: renamed from: iI丨LLL1, reason: contains not printable characters */
    public final LinearLayout f3348iILLL1;

    /* JADX INFO: renamed from: lIi丨I, reason: contains not printable characters */
    public final TextView f3349lIiI;

    /* JADX INFO: renamed from: lI丨lii, reason: contains not printable characters */
    public WorldNativeImgParams f3350lIlii;
    public boolean llliI;

    /* JADX INFO: renamed from: ll丨L1ii, reason: contains not printable characters */
    public WorldNativeTvParams f3351llL1ii;

    /* JADX INFO: renamed from: l丨Li1LL, reason: contains not printable characters */
    public final LinearLayout f3352lLi1LL;

    /* JADX INFO: renamed from: 丨il, reason: contains not printable characters */
    public final TextView f3353il;

    /* JADX INFO: renamed from: 丨lL, reason: contains not printable characters */
    public WorldNativeTagParams f3354lL;

    /* JADX INFO: renamed from: 丨l丨, reason: contains not printable characters */
    public n f3355l;

    public static void IL1Iii(TextView textView, WorldNativeTvParams worldNativeTvParams) {
        if (textView == null) {
            AdLog.subAd("setTextViewParams: View is null");
            return;
        }
        if (worldNativeTvParams != null) {
            if (!TextUtils.isEmpty(worldNativeTvParams.getTextColor())) {
                textView.setTextColor(Color.parseColor(worldNativeTvParams.getTextColor()));
            }
            if (worldNativeTvParams.getTextSize() != -1) {
                textView.setTextSize(2, worldNativeTvParams.getTextSize());
            }
            IL1Iii((View) textView, (g) worldNativeTvParams);
        }
    }

    public void setTags(List<String> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            TextView textView = (TextView) this.I11L.get(i10);
            textView.setVisibility(0);
            textView.setText(list.get(i10));
        }
    }

    public int getIconDefWidth() {
        return this.IL1Iii.getResources().getDimensionPixelSize(IDUtil.getDimen(this.IL1Iii, "dp_90"));
    }

    public int getItemDefHeight() {
        return this.IL1Iii.getResources().getDimensionPixelSize(IDUtil.getDimen(this.IL1Iii, "dp_135"));
    }

    public void setCenterLyParams(WorldNativeLyParams worldNativeLyParams) {
        this.iIlLiL = worldNativeLyParams;
    }

    public void setContent(String str) {
        TextView textView = this.ILL;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setContentLyParams(WorldNativeLyParams worldNativeLyParams) {
        this.iIi1 = worldNativeLyParams;
    }

    public void setDes(String str) {
        TextView textView = this.f3353il;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setDetailsParams(WorldNativeTvParams worldNativeTvParams) {
        this.f3351llL1ii = worldNativeTvParams;
    }

    public void setIconImageParams(WorldNativeImgParams worldNativeImgParams) {
        this.f3350lIlii = worldNativeImgParams;
    }

    public void setTagLyParams(WorldNativeLyParams worldNativeLyParams) {
        this.I11li1 = worldNativeLyParams;
    }

    public void setTagTvParams(WorldNativeTagParams worldNativeTagParams) {
        this.f3354lL = worldNativeTagParams;
    }

    public void setTitle(String str) {
        TextView textView = this.f3347L11I;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setTitle2Params(WorldNativeTvParams worldNativeTvParams) {
        this.LlLI1 = worldNativeTvParams;
    }

    public void setTitleParams(WorldNativeTvParams worldNativeTvParams) {
        this.f51170Lil = worldNativeTvParams;
    }

    public void setViewCallback(n nVar) {
        this.f3355l = nVar;
    }

    public WorldNativeView(Activity activity) {
        super(activity);
        ArrayList arrayList = new ArrayList();
        this.I11L = arrayList;
        this.llliI = false;
        o oVar = new o(this);
        this.IL1Iii = activity;
        View viewInflate = LayoutInflater.from(activity).inflate(IDUtil.getLayoutID(activity, "main_layout_world_native"), (ViewGroup) null, false);
        this.ILil = viewInflate;
        this.f3345IiL = (RelativeLayout) viewInflate.findViewById(IDUtil.getViewID(activity, "main_cp_native_icon_rl"));
        this.I1I = (ImageView) viewInflate.findViewById(IDUtil.getViewID(activity, "main_cp_native_icon"));
        this.f3344IL = (RoundRectImageView) viewInflate.findViewById(IDUtil.getViewID(activity, "main_cp_native_rr_icon"));
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(IDUtil.getViewID(activity, "main_cp_native_content"));
        this.f3348iILLL1 = linearLayout;
        this.f3352lLi1LL = (LinearLayout) viewInflate.findViewById(IDUtil.getViewID(activity, "main_cp_native_center_ly"));
        this.Ilil = (LinearLayout) viewInflate.findViewById(IDUtil.getViewID(activity, "main_cp_native_tag_ly"));
        this.f3347L11I = (TextView) viewInflate.findViewById(IDUtil.getViewID(activity, "main_cp_native_title"));
        this.f3353il = (TextView) viewInflate.findViewById(IDUtil.getViewID(activity, "main_cp_native_title2"));
        this.ILL = (TextView) viewInflate.findViewById(IDUtil.getViewID(activity, "main_cp_native_details"));
        TextView textView = (TextView) viewInflate.findViewById(IDUtil.getViewID(activity, "main_cp_native_tag1"));
        this.f3346Ll1 = textView;
        TextView textView2 = (TextView) viewInflate.findViewById(IDUtil.getViewID(activity, "main_cp_native_tag2"));
        this.f3349lIiI = textView2;
        TextView textView3 = (TextView) viewInflate.findViewById(IDUtil.getViewID(activity, "main_cp_native_tag3"));
        this.f3343ILl = textView3;
        arrayList.add(textView);
        arrayList.add(textView2);
        arrayList.add(textView3);
        linearLayout.setOnClickListener(oVar);
        addView(viewInflate);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        n nVar;
        super.onWindowVisibilityChanged(i10);
        if (i10 == 0) {
            LogUtil.d("zhazha", "可见");
            if (!this.llliI && (nVar = this.f3355l) != null) {
                this.llliI = true;
                ((e0) nVar).b();
                return;
            }
            return;
        }
        if (i10 == 4 || i10 == 8) {
            LogUtil.d("zhazha", "不可见");
        }
    }

    public static void IL1Iii(LinearLayout linearLayout, WorldNativeLyParams worldNativeLyParams) {
        if (linearLayout == null) {
            AdLog.subAd("setContentLyParams: View is null");
        } else if (worldNativeLyParams != null) {
            IL1Iii((View) linearLayout, (g) worldNativeLyParams);
            if (TextUtils.isEmpty(worldNativeLyParams.getBgColor())) {
                return;
            }
            linearLayout.setBackgroundColor(Color.parseColor(worldNativeLyParams.getBgColor()));
        }
    }

    public static void IL1Iii(TextView textView, WorldNativeTagParams worldNativeTagParams) {
        if (textView == null) {
            AdLog.subAd("setTagViewParams: View is null");
            return;
        }
        if (worldNativeTagParams != null) {
            if (!TextUtils.isEmpty(worldNativeTagParams.getBgColor())) {
                textView.setBackgroundColor(Color.parseColor(worldNativeTagParams.getBgColor()));
            }
            if (!TextUtils.isEmpty(worldNativeTagParams.getTextColor())) {
                textView.setTextColor(Color.parseColor(worldNativeTagParams.getTextColor()));
            }
            if (worldNativeTagParams.getTextSize() != -1) {
                textView.setTextSize(2, worldNativeTagParams.getTextSize());
            }
        }
    }

    public static void IL1Iii(View view, g gVar) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        if (gVar.getRightMargin() != -1) {
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = gVar.getRightMargin();
        }
        if (gVar.getLeftMargin() != -1) {
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = gVar.getLeftMargin();
        }
        if (gVar.getTopMargin() != -1) {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = gVar.getTopMargin();
        }
        if (gVar.getBottomMargin() != -1) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = gVar.getBottomMargin();
        }
        view.setLayoutParams(layoutParams);
    }
}
