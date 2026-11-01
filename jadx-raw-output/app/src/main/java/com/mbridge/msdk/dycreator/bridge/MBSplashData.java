package com.mbridge.msdk.dycreator.bridge;

import com.mbridge.msdk.dycreator.viewdata.base.a;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: loaded from: classes10.dex */
public class MBSplashData implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DyOption f34325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f34326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f34327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f34328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f34329e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CampaignEx f34330f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f34331g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f34332h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f34333i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f34334j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f34335k = 0;

    public String getAdClickText() {
        return this.f34327c;
    }

    public String getAppInfo() {
        return this.f34326b;
    }

    @Override // com.mbridge.msdk.dycreator.viewdata.base.a
    public CampaignEx getBindData() {
        return this.f34330f;
    }

    public int getClickType() {
        return this.f34335k;
    }

    public String getCountDownText() {
        return this.f34328d;
    }

    public DyOption getDyOption() {
        return this.f34325a;
    }

    @Override // com.mbridge.msdk.dycreator.viewdata.base.a
    public DyOption getEffectData() {
        return this.f34325a;
    }

    public int getLogoImage() {
        return this.f34332h;
    }

    public String getLogoText() {
        return this.f34329e;
    }

    public int getNoticeImage() {
        return this.f34331g;
    }

    public float getxInScreen() {
        return this.f34333i;
    }

    public float getyInScreen() {
        return this.f34334j;
    }

    public void setAdClickText(String str) {
        this.f34327c = str;
    }

    public void setAppInfo(String str) {
        this.f34326b = str;
    }

    public void setClickType(int i10) {
        this.f34335k = i10;
    }

    public void setCountDownText(String str) {
        this.f34328d = str;
    }

    public void setLogoImage(int i10) {
        this.f34332h = i10;
    }

    public void setLogoText(String str) {
        this.f34329e = str;
    }

    public void setNoticeImage(int i10) {
        this.f34331g = i10;
    }

    public void setxInScreen(float f10) {
        this.f34333i = f10;
    }

    public void setyInScreen(float f10) {
        this.f34334j = f10;
    }

    public MBSplashData(DyOption dyOption) {
        this.f34325a = dyOption;
        this.f34330f = dyOption.getCampaignEx();
    }
}
