package rf;

import androidx.annotation.NonNull;
import com.explorestack.protobuf.adcom.Ad;
import io.bidmachine.LabelData;
import io.bidmachine.PrivacySheetData;
import io.bidmachine.TrackEventType;
import io.bidmachine.displays.mapper.LabelDataMapper;
import io.bidmachine.displays.mapper.PositionDataMapper;
import io.bidmachine.displays.mapper.PrivacySheetDataMapper;
import io.bidmachine.unified.UnifiedMediationParams;
import io.bidmachine.util.Executable;
import io.bidmachine.util.Utils;

/* JADX INFO: compiled from: NativeAdObjectParams.java */
/* JADX INFO: loaded from: classes11.dex */
public final class k extends a {

    @NonNull
    private final LabelDataMapper labelDataMapper;

    @NonNull
    private final PositionDataMapper positionDataMapper;

    @NonNull
    private final PrivacySheetDataMapper privacySheetDataMapper;

    @Override // rf.h, io.bidmachine.models.AdObjectParams
    public boolean isValid() {
        return true;
    }

    public k(@NonNull Ad ad2) {
        super(ad2);
        PositionDataMapper positionDataMapper = new PositionDataMapper();
        this.positionDataMapper = positionDataMapper;
        LabelDataMapper labelDataMapper = new LabelDataMapper(positionDataMapper);
        this.labelDataMapper = labelDataMapper;
        this.privacySheetDataMapper = new PrivacySheetDataMapper(labelDataMapper);
        Ad.Display.Native r10 = ad2.getDisplay().getNative();
        Ad.Display.Native.LinkAsset link = r10.getLink();
        if (link != null && link != Ad.Display.Native.LinkAsset.getDefaultInstance()) {
            getData().put("clickUrl", link.getUrl());
            for (int i10 = 0; i10 < link.getTrkrCount(); i10++) {
                addEvent(TrackEventType.Click, link.getTrkr(i10));
            }
        }
        for (Ad.Display.Native.Asset asset : r10.getAssetList()) {
            int id2 = asset.getId();
            if (id2 != 4) {
                if (id2 != 7) {
                    if (id2 != 8) {
                        if (id2 != 101) {
                            if (id2 != 102) {
                                if (id2 != 123) {
                                    if (id2 != 124) {
                                        if (id2 != 127) {
                                            if (id2 == 128) {
                                                getData().put(UnifiedMediationParams.KEY_IMAGE_URL, asset.getImage().getUrl());
                                            }
                                        } else {
                                            getData().put(UnifiedMediationParams.KEY_DESCRIPTION, asset.getData().getValue());
                                        }
                                    } else {
                                        getData().put(UnifiedMediationParams.KEY_ICON_URL, asset.getImage().getUrl());
                                    }
                                } else {
                                    getData().put("title", asset.getTitle().getText());
                                }
                            } else {
                                Utils.ifNotNull(this.privacySheetDataMapper.map(asset), new Executable() { // from class: rf.j
                                    @Override // io.bidmachine.util.Executable
                                    public final void execute(Object obj) {
                                        this.f66762a.lambda$new$1((PrivacySheetData) obj);
                                    }
                                });
                            }
                        } else {
                            Utils.ifNotNull(this.labelDataMapper.map(asset.getLabel()), new Executable() { // from class: rf.i
                                @Override // io.bidmachine.util.Executable
                                public final void execute(Object obj) {
                                    this.f66761a.lambda$new$0((LabelData) obj);
                                }
                            });
                        }
                    } else {
                        getData().put("cta", asset.getData().getValue());
                    }
                } else {
                    try {
                        getData().put("rating", Float.valueOf(asset.getData().getValue()));
                    } catch (NumberFormatException unused) {
                    }
                }
            } else {
                Ad.Display.Native.Asset.VideoAsset defaultInstance = Ad.Display.Native.Asset.VideoAsset.getDefaultInstance();
                if (!asset.getVideo().getCurl().equals(defaultInstance.getCurl())) {
                    getData().put(UnifiedMediationParams.KEY_VIDEO_URL, asset.getVideo().getCurl());
                }
                if (!asset.getVideo().getAdm().equals(defaultInstance.getAdm())) {
                    getData().put(UnifiedMediationParams.KEY_VIDEO_ADM, asset.getVideo().getAdm());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(LabelData labelData) {
        getData().put(UnifiedMediationParams.KEY_AD_LABEL, labelData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(PrivacySheetData privacySheetData) {
        getData().put(UnifiedMediationParams.KEY_PRIVACY_SHEET, privacySheetData);
    }
}
