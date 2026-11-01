package com.mbridge.msdk.dycreator.wrapper;

import com.mbridge.msdk.dycreator.listener.DyCountDownListenerWrapper;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class DyOption {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<String> f34484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private File f34485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CampaignEx f34486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private DyAdType f34487d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f34488e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f34489f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f34490g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f34491h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f34492i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f34493j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f34494k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f34495l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f34496m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f34497n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f34498o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f34499p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f34500q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private DyCountDownListenerWrapper f34501r;

    public static class Builder implements IViewOptionBuilder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<String> f34502a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private File f34503b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CampaignEx f34504c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private DyAdType f34505d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f34506e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f34507f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f34508g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f34509h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f34510i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f34511j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f34512k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f34513l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f34514m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f34515n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f34516o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f34517p;

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder adChoiceLink(String str) {
            this.f34507f = str;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public DyOption build() {
            return new DyOption(this);
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder campaignEx(CampaignEx campaignEx) {
            this.f34504c = campaignEx;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder canSkip(boolean z10) {
            this.f34506e = z10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder countDownTime(int i10) {
            this.f34516o = i10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder dyAdType(DyAdType dyAdType) {
            this.f34505d = dyAdType;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder file(File file) {
            this.f34503b = file;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder fileDirs(List<String> list) {
            this.f34502a = list;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isApkInfoVisible(boolean z10) {
            this.f34511j = z10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isClickButtonVisible(boolean z10) {
            this.f34509h = z10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isLogoVisible(boolean z10) {
            this.f34512k = z10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isScreenClick(boolean z10) {
            this.f34508g = z10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isShakeVisible(boolean z10) {
            this.f34510i = z10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder orientation(int i10) {
            this.f34515n = i10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder shakeStrenght(int i10) {
            this.f34513l = i10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder shakeTime(int i10) {
            this.f34514m = i10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder templateType(int i10) {
            this.f34517p = i10;
            return this;
        }
    }

    public interface IViewOptionBuilder {
        IViewOptionBuilder adChoiceLink(String str);

        DyOption build();

        IViewOptionBuilder campaignEx(CampaignEx campaignEx);

        IViewOptionBuilder canSkip(boolean z10);

        IViewOptionBuilder countDownTime(int i10);

        IViewOptionBuilder dyAdType(DyAdType dyAdType);

        IViewOptionBuilder file(File file);

        IViewOptionBuilder fileDirs(List<String> list);

        IViewOptionBuilder isApkInfoVisible(boolean z10);

        IViewOptionBuilder isClickButtonVisible(boolean z10);

        IViewOptionBuilder isLogoVisible(boolean z10);

        IViewOptionBuilder isScreenClick(boolean z10);

        IViewOptionBuilder isShakeVisible(boolean z10);

        IViewOptionBuilder orientation(int i10);

        IViewOptionBuilder shakeStrenght(int i10);

        IViewOptionBuilder shakeTime(int i10);

        IViewOptionBuilder templateType(int i10);
    }

    public String getAdChoiceLink() {
        return this.f34488e;
    }

    public CampaignEx getCampaignEx() {
        return this.f34486c;
    }

    public int getCountDownTime() {
        return this.f34498o;
    }

    public int getCurrentCountDown() {
        return this.f34499p;
    }

    public DyAdType getDyAdType() {
        return this.f34487d;
    }

    public File getFile() {
        return this.f34485b;
    }

    public List<String> getFileDirs() {
        return this.f34484a;
    }

    public int getOrientation() {
        return this.f34497n;
    }

    public int getShakeStrenght() {
        return this.f34495l;
    }

    public int getShakeTime() {
        return this.f34496m;
    }

    public int getTemplateType() {
        return this.f34500q;
    }

    public boolean isApkInfoVisible() {
        return this.f34493j;
    }

    public boolean isCanSkip() {
        return this.f34490g;
    }

    public boolean isClickButtonVisible() {
        return this.f34491h;
    }

    public boolean isClickScreen() {
        return this.f34489f;
    }

    public boolean isLogoVisible() {
        return this.f34494k;
    }

    public boolean isShakeVisible() {
        return this.f34492i;
    }

    public void setDyCountDownListener(int i10) {
        DyCountDownListenerWrapper dyCountDownListenerWrapper = this.f34501r;
        if (dyCountDownListenerWrapper != null) {
            dyCountDownListenerWrapper.getCountDownValue(i10);
        }
        this.f34499p = i10;
    }

    public void setDyCountDownListenerWrapper(DyCountDownListenerWrapper dyCountDownListenerWrapper) {
        this.f34501r = dyCountDownListenerWrapper;
    }

    public DyOption(Builder builder) {
        this.f34484a = builder.f34502a;
        this.f34485b = builder.f34503b;
        this.f34486c = builder.f34504c;
        this.f34487d = builder.f34505d;
        this.f34490g = builder.f34506e;
        this.f34488e = builder.f34507f;
        this.f34489f = builder.f34508g;
        this.f34491h = builder.f34509h;
        this.f34493j = builder.f34511j;
        this.f34492i = builder.f34510i;
        this.f34494k = builder.f34512k;
        this.f34495l = builder.f34513l;
        this.f34496m = builder.f34514m;
        this.f34497n = builder.f34515n;
        this.f34498o = builder.f34516o;
        this.f34500q = builder.f34517p;
    }
}
