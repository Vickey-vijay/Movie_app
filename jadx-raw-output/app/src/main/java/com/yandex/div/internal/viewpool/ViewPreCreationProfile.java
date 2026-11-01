package com.yandex.div.internal.viewpool;

import al.d;
import bl.d2;
import bl.o1;
import bl.y1;
import ck.i;
import ck.p;
import kotlinx.serialization.descriptors.a;
import xk.b;
import xk.f;

/* JADX INFO: compiled from: ViewPreCreationProfile.kt */
/* JADX INFO: loaded from: classes5.dex */
@f
public final class ViewPreCreationProfile {
    public static final Companion Companion = new Companion(null);
    private final PreCreationModel custom;
    private final PreCreationModel gallery;
    private final PreCreationModel gifImage;
    private final PreCreationModel grid;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f45843id;
    private final PreCreationModel image;
    private final PreCreationModel indicator;
    private final PreCreationModel input;
    private final PreCreationModel linearContainer;
    private final PreCreationModel overlapContainer;
    private final PreCreationModel pager;
    private final PreCreationModel select;
    private final PreCreationModel slider;
    private final PreCreationModel state;

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    private final PreCreationModel f3263switch;
    private final PreCreationModel tab;
    private final PreCreationModel text;
    private final PreCreationModel video;
    private final PreCreationModel wrapContainer;

    /* JADX INFO: compiled from: ViewPreCreationProfile.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final b<ViewPreCreationProfile> serializer() {
            return ViewPreCreationProfile$$serializer.INSTANCE;
        }
    }

    public ViewPreCreationProfile() {
        this((String) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, 524287, (i) null);
    }

    public /* synthetic */ ViewPreCreationProfile(int i10, String str, PreCreationModel preCreationModel, PreCreationModel preCreationModel2, PreCreationModel preCreationModel3, PreCreationModel preCreationModel4, PreCreationModel preCreationModel5, PreCreationModel preCreationModel6, PreCreationModel preCreationModel7, PreCreationModel preCreationModel8, PreCreationModel preCreationModel9, PreCreationModel preCreationModel10, PreCreationModel preCreationModel11, PreCreationModel preCreationModel12, PreCreationModel preCreationModel13, PreCreationModel preCreationModel14, PreCreationModel preCreationModel15, PreCreationModel preCreationModel16, PreCreationModel preCreationModel17, PreCreationModel preCreationModel18, y1 y1Var) {
        if ((i10 & 0) != 0) {
            o1.a(i10, 0, ViewPreCreationProfile$$serializer.INSTANCE.getDescriptor());
        }
        this.f45843id = (i10 & 1) == 0 ? null : str;
        this.text = (i10 & 2) == 0 ? new PreCreationModel(20, 0, 0, 6, (i) null) : preCreationModel;
        this.image = (i10 & 4) == 0 ? new PreCreationModel(20, 0, 0, 6, (i) null) : preCreationModel2;
        this.gifImage = (i10 & 8) == 0 ? new PreCreationModel(3, 0, 0, 6, (i) null) : preCreationModel3;
        this.overlapContainer = (i10 & 16) == 0 ? new PreCreationModel(8, 0, 0, 6, (i) null) : preCreationModel4;
        this.linearContainer = (i10 & 32) == 0 ? new PreCreationModel(12, 0, 0, 6, (i) null) : preCreationModel5;
        this.wrapContainer = (i10 & 64) == 0 ? new PreCreationModel(4, 0, 0, 6, (i) null) : preCreationModel6;
        this.grid = (i10 & 128) == 0 ? new PreCreationModel(4, 0, 0, 6, (i) null) : preCreationModel7;
        this.gallery = (i10 & 256) == 0 ? new PreCreationModel(6, 0, 0, 6, (i) null) : preCreationModel8;
        this.pager = (i10 & 512) == 0 ? new PreCreationModel(2, 0, 0, 6, (i) null) : preCreationModel9;
        this.tab = (i10 & 1024) == 0 ? new PreCreationModel(2, 0, 0, 6, (i) null) : preCreationModel10;
        this.state = (i10 & 2048) == 0 ? new PreCreationModel(4, 0, 0, 6, (i) null) : preCreationModel11;
        this.custom = (i10 & 4096) == 0 ? new PreCreationModel(2, 0, 0, 6, (i) null) : preCreationModel12;
        this.indicator = (i10 & 8192) == 0 ? new PreCreationModel(2, 0, 0, 6, (i) null) : preCreationModel13;
        this.slider = (i10 & 16384) == 0 ? new PreCreationModel(2, 0, 0, 6, (i) null) : preCreationModel14;
        this.input = (32768 & i10) == 0 ? new PreCreationModel(2, 0, 0, 6, (i) null) : preCreationModel15;
        this.select = (65536 & i10) == 0 ? new PreCreationModel(2, 0, 0, 6, (i) null) : preCreationModel16;
        this.video = (131072 & i10) == 0 ? new PreCreationModel(2, 0, 0, 6, (i) null) : preCreationModel17;
        this.f3263switch = (i10 & 262144) == 0 ? new PreCreationModel(2, 0, 0, 6, (i) null) : preCreationModel18;
    }

    public static final /* synthetic */ void write$Self(ViewPreCreationProfile viewPreCreationProfile, d dVar, a aVar) {
        if (dVar.q(aVar, 0) || viewPreCreationProfile.f45843id != null) {
            dVar.C(aVar, 0, d2.f5397a, viewPreCreationProfile.f45843id);
        }
        if (dVar.q(aVar, 1) || !p.e(viewPreCreationProfile.text, new PreCreationModel(20, 0, 0, 6, (i) null))) {
            dVar.m(aVar, 1, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.text);
        }
        if (dVar.q(aVar, 2) || !p.e(viewPreCreationProfile.image, new PreCreationModel(20, 0, 0, 6, (i) null))) {
            dVar.m(aVar, 2, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.image);
        }
        if (dVar.q(aVar, 3) || !p.e(viewPreCreationProfile.gifImage, new PreCreationModel(3, 0, 0, 6, (i) null))) {
            dVar.m(aVar, 3, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.gifImage);
        }
        if (dVar.q(aVar, 4) || !p.e(viewPreCreationProfile.overlapContainer, new PreCreationModel(8, 0, 0, 6, (i) null))) {
            dVar.m(aVar, 4, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.overlapContainer);
        }
        if (dVar.q(aVar, 5) || !p.e(viewPreCreationProfile.linearContainer, new PreCreationModel(12, 0, 0, 6, (i) null))) {
            dVar.m(aVar, 5, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.linearContainer);
        }
        if (dVar.q(aVar, 6) || !p.e(viewPreCreationProfile.wrapContainer, new PreCreationModel(4, 0, 0, 6, (i) null))) {
            dVar.m(aVar, 6, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.wrapContainer);
        }
        if (dVar.q(aVar, 7) || !p.e(viewPreCreationProfile.grid, new PreCreationModel(4, 0, 0, 6, (i) null))) {
            dVar.m(aVar, 7, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.grid);
        }
        if (dVar.q(aVar, 8) || !p.e(viewPreCreationProfile.gallery, new PreCreationModel(6, 0, 0, 6, (i) null))) {
            dVar.m(aVar, 8, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.gallery);
        }
        if (dVar.q(aVar, 9) || !p.e(viewPreCreationProfile.pager, new PreCreationModel(2, 0, 0, 6, (i) null))) {
            dVar.m(aVar, 9, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.pager);
        }
        if (dVar.q(aVar, 10) || !p.e(viewPreCreationProfile.tab, new PreCreationModel(2, 0, 0, 6, (i) null))) {
            dVar.m(aVar, 10, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.tab);
        }
        if (dVar.q(aVar, 11) || !p.e(viewPreCreationProfile.state, new PreCreationModel(4, 0, 0, 6, (i) null))) {
            dVar.m(aVar, 11, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.state);
        }
        if (dVar.q(aVar, 12) || !p.e(viewPreCreationProfile.custom, new PreCreationModel(2, 0, 0, 6, (i) null))) {
            dVar.m(aVar, 12, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.custom);
        }
        if (dVar.q(aVar, 13) || !p.e(viewPreCreationProfile.indicator, new PreCreationModel(2, 0, 0, 6, (i) null))) {
            dVar.m(aVar, 13, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.indicator);
        }
        if (dVar.q(aVar, 14) || !p.e(viewPreCreationProfile.slider, new PreCreationModel(2, 0, 0, 6, (i) null))) {
            dVar.m(aVar, 14, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.slider);
        }
        if (dVar.q(aVar, 15) || !p.e(viewPreCreationProfile.input, new PreCreationModel(2, 0, 0, 6, (i) null))) {
            dVar.m(aVar, 15, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.input);
        }
        if (dVar.q(aVar, 16) || !p.e(viewPreCreationProfile.select, new PreCreationModel(2, 0, 0, 6, (i) null))) {
            dVar.m(aVar, 16, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.select);
        }
        if (dVar.q(aVar, 17) || !p.e(viewPreCreationProfile.video, new PreCreationModel(2, 0, 0, 6, (i) null))) {
            dVar.m(aVar, 17, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.video);
        }
        if (dVar.q(aVar, 18) || !p.e(viewPreCreationProfile.f3263switch, new PreCreationModel(2, 0, 0, 6, (i) null))) {
            dVar.m(aVar, 18, PreCreationModel$$serializer.INSTANCE, viewPreCreationProfile.f3263switch);
        }
    }

    public final ViewPreCreationProfile copy(String str, PreCreationModel preCreationModel, PreCreationModel preCreationModel2, PreCreationModel preCreationModel3, PreCreationModel preCreationModel4, PreCreationModel preCreationModel5, PreCreationModel preCreationModel6, PreCreationModel preCreationModel7, PreCreationModel preCreationModel8, PreCreationModel preCreationModel9, PreCreationModel preCreationModel10, PreCreationModel preCreationModel11, PreCreationModel preCreationModel12, PreCreationModel preCreationModel13, PreCreationModel preCreationModel14, PreCreationModel preCreationModel15, PreCreationModel preCreationModel16, PreCreationModel preCreationModel17, PreCreationModel preCreationModel18) {
        return new ViewPreCreationProfile(str, preCreationModel, preCreationModel2, preCreationModel3, preCreationModel4, preCreationModel5, preCreationModel6, preCreationModel7, preCreationModel8, preCreationModel9, preCreationModel10, preCreationModel11, preCreationModel12, preCreationModel13, preCreationModel14, preCreationModel15, preCreationModel16, preCreationModel17, preCreationModel18);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewPreCreationProfile)) {
            return false;
        }
        ViewPreCreationProfile viewPreCreationProfile = (ViewPreCreationProfile) obj;
        return p.e(this.f45843id, viewPreCreationProfile.f45843id) && p.e(this.text, viewPreCreationProfile.text) && p.e(this.image, viewPreCreationProfile.image) && p.e(this.gifImage, viewPreCreationProfile.gifImage) && p.e(this.overlapContainer, viewPreCreationProfile.overlapContainer) && p.e(this.linearContainer, viewPreCreationProfile.linearContainer) && p.e(this.wrapContainer, viewPreCreationProfile.wrapContainer) && p.e(this.grid, viewPreCreationProfile.grid) && p.e(this.gallery, viewPreCreationProfile.gallery) && p.e(this.pager, viewPreCreationProfile.pager) && p.e(this.tab, viewPreCreationProfile.tab) && p.e(this.state, viewPreCreationProfile.state) && p.e(this.custom, viewPreCreationProfile.custom) && p.e(this.indicator, viewPreCreationProfile.indicator) && p.e(this.slider, viewPreCreationProfile.slider) && p.e(this.input, viewPreCreationProfile.input) && p.e(this.select, viewPreCreationProfile.select) && p.e(this.video, viewPreCreationProfile.video) && p.e(this.f3263switch, viewPreCreationProfile.f3263switch);
    }

    public int hashCode() {
        String str = this.f45843id;
        return ((((((((((((((((((((((((((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.text.hashCode()) * 31) + this.image.hashCode()) * 31) + this.gifImage.hashCode()) * 31) + this.overlapContainer.hashCode()) * 31) + this.linearContainer.hashCode()) * 31) + this.wrapContainer.hashCode()) * 31) + this.grid.hashCode()) * 31) + this.gallery.hashCode()) * 31) + this.pager.hashCode()) * 31) + this.tab.hashCode()) * 31) + this.state.hashCode()) * 31) + this.custom.hashCode()) * 31) + this.indicator.hashCode()) * 31) + this.slider.hashCode()) * 31) + this.input.hashCode()) * 31) + this.select.hashCode()) * 31) + this.video.hashCode()) * 31) + this.f3263switch.hashCode();
    }

    public String toString() {
        return "ViewPreCreationProfile(id=" + this.f45843id + ", text=" + this.text + ", image=" + this.image + ", gifImage=" + this.gifImage + ", overlapContainer=" + this.overlapContainer + ", linearContainer=" + this.linearContainer + ", wrapContainer=" + this.wrapContainer + ", grid=" + this.grid + ", gallery=" + this.gallery + ", pager=" + this.pager + ", tab=" + this.tab + ", state=" + this.state + ", custom=" + this.custom + ", indicator=" + this.indicator + ", slider=" + this.slider + ", input=" + this.input + ", select=" + this.select + ", video=" + this.video + ", switch=" + this.f3263switch + ')';
    }

    public final PreCreationModel getCustom() {
        return this.custom;
    }

    public final PreCreationModel getGallery() {
        return this.gallery;
    }

    public final PreCreationModel getGifImage() {
        return this.gifImage;
    }

    public final PreCreationModel getGrid() {
        return this.grid;
    }

    public final String getId() {
        return this.f45843id;
    }

    public final PreCreationModel getImage() {
        return this.image;
    }

    public final PreCreationModel getIndicator() {
        return this.indicator;
    }

    public final PreCreationModel getInput() {
        return this.input;
    }

    public final PreCreationModel getLinearContainer() {
        return this.linearContainer;
    }

    public final PreCreationModel getOverlapContainer() {
        return this.overlapContainer;
    }

    public final PreCreationModel getPager() {
        return this.pager;
    }

    public final PreCreationModel getSelect() {
        return this.select;
    }

    public final PreCreationModel getSlider() {
        return this.slider;
    }

    public final PreCreationModel getState() {
        return this.state;
    }

    public final PreCreationModel getSwitch() {
        return this.f3263switch;
    }

    public final PreCreationModel getTab() {
        return this.tab;
    }

    public final PreCreationModel getText() {
        return this.text;
    }

    public final PreCreationModel getVideo() {
        return this.video;
    }

    public final PreCreationModel getWrapContainer() {
        return this.wrapContainer;
    }

    public ViewPreCreationProfile(String str, PreCreationModel preCreationModel, PreCreationModel preCreationModel2, PreCreationModel preCreationModel3, PreCreationModel preCreationModel4, PreCreationModel preCreationModel5, PreCreationModel preCreationModel6, PreCreationModel preCreationModel7, PreCreationModel preCreationModel8, PreCreationModel preCreationModel9, PreCreationModel preCreationModel10, PreCreationModel preCreationModel11, PreCreationModel preCreationModel12, PreCreationModel preCreationModel13, PreCreationModel preCreationModel14, PreCreationModel preCreationModel15, PreCreationModel preCreationModel16, PreCreationModel preCreationModel17, PreCreationModel preCreationModel18) {
        this.f45843id = str;
        this.text = preCreationModel;
        this.image = preCreationModel2;
        this.gifImage = preCreationModel3;
        this.overlapContainer = preCreationModel4;
        this.linearContainer = preCreationModel5;
        this.wrapContainer = preCreationModel6;
        this.grid = preCreationModel7;
        this.gallery = preCreationModel8;
        this.pager = preCreationModel9;
        this.tab = preCreationModel10;
        this.state = preCreationModel11;
        this.custom = preCreationModel12;
        this.indicator = preCreationModel13;
        this.slider = preCreationModel14;
        this.input = preCreationModel15;
        this.select = preCreationModel16;
        this.video = preCreationModel17;
        this.f3263switch = preCreationModel18;
    }

    public /* synthetic */ ViewPreCreationProfile(String str, PreCreationModel preCreationModel, PreCreationModel preCreationModel2, PreCreationModel preCreationModel3, PreCreationModel preCreationModel4, PreCreationModel preCreationModel5, PreCreationModel preCreationModel6, PreCreationModel preCreationModel7, PreCreationModel preCreationModel8, PreCreationModel preCreationModel9, PreCreationModel preCreationModel10, PreCreationModel preCreationModel11, PreCreationModel preCreationModel12, PreCreationModel preCreationModel13, PreCreationModel preCreationModel14, PreCreationModel preCreationModel15, PreCreationModel preCreationModel16, PreCreationModel preCreationModel17, PreCreationModel preCreationModel18, int i10, i iVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? new PreCreationModel(20, 0, 0, 6, (i) null) : preCreationModel, (i10 & 4) != 0 ? new PreCreationModel(20, 0, 0, 6, (i) null) : preCreationModel2, (i10 & 8) != 0 ? new PreCreationModel(3, 0, 0, 6, (i) null) : preCreationModel3, (i10 & 16) != 0 ? new PreCreationModel(8, 0, 0, 6, (i) null) : preCreationModel4, (i10 & 32) != 0 ? new PreCreationModel(12, 0, 0, 6, (i) null) : preCreationModel5, (i10 & 64) != 0 ? new PreCreationModel(4, 0, 0, 6, (i) null) : preCreationModel6, (i10 & 128) != 0 ? new PreCreationModel(4, 0, 0, 6, (i) null) : preCreationModel7, (i10 & 256) != 0 ? new PreCreationModel(6, 0, 0, 6, (i) null) : preCreationModel8, (i10 & 512) != 0 ? new PreCreationModel(2, 0, 0, 6, (i) null) : preCreationModel9, (i10 & 1024) != 0 ? new PreCreationModel(2, 0, 0, 6, (i) null) : preCreationModel10, (i10 & 2048) != 0 ? new PreCreationModel(4, 0, 0, 6, (i) null) : preCreationModel11, (i10 & 4096) != 0 ? new PreCreationModel(2, 0, 0, 6, (i) null) : preCreationModel12, (i10 & 8192) != 0 ? new PreCreationModel(2, 0, 0, 6, (i) null) : preCreationModel13, (i10 & 16384) != 0 ? new PreCreationModel(2, 0, 0, 6, (i) null) : preCreationModel14, (i10 & 32768) != 0 ? new PreCreationModel(2, 0, 0, 6, (i) null) : preCreationModel15, (i10 & 65536) != 0 ? new PreCreationModel(2, 0, 0, 6, (i) null) : preCreationModel16, (i10 & 131072) != 0 ? new PreCreationModel(2, 0, 0, 6, (i) null) : preCreationModel17, (i10 & 262144) != 0 ? new PreCreationModel(2, 0, 0, 6, (i) null) : preCreationModel18);
    }
}
