package io.bidmachine.ads.networks.adaptiverendering;

import androidx.annotation.VisibleForTesting;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import ck.p;
import com.explorestack.protobuf.ProtocolStringList;
import com.ironsource.C3537j8;
import io.appmetrica.analytics.impl.A2;
import io.bidmachine.ads.networks.adaptiverendering.AdaptiveRenderingParams;
import io.bidmachine.ads.networks.adaptiverendering.measurer.AdMeasurerFactory;
import io.bidmachine.core.Logger;
import io.bidmachine.protobuf.rendering.Rendering;
import io.bidmachine.protobuf.rendering.RenderingFeature;
import io.bidmachine.rendering.measurer.MeasurerFactory;
import io.bidmachine.rendering.model.AdElementParams;
import io.bidmachine.rendering.model.AdElementType;
import io.bidmachine.rendering.model.AdParams;
import io.bidmachine.rendering.model.AdPhaseParams;
import io.bidmachine.rendering.model.AnimationDirectionType;
import io.bidmachine.rendering.model.AnimationEventType;
import io.bidmachine.rendering.model.AnimationFunctionType;
import io.bidmachine.rendering.model.AnimationParams;
import io.bidmachine.rendering.model.AnimationStyleType;
import io.bidmachine.rendering.model.AppearanceParams;
import io.bidmachine.rendering.model.Background;
import io.bidmachine.rendering.model.BackgroundSource;
import io.bidmachine.rendering.model.Base64ResourceSource;
import io.bidmachine.rendering.model.BrokenCreativeAlgorithmParams;
import io.bidmachine.rendering.model.BrokenCreativeAlgorithmType;
import io.bidmachine.rendering.model.BrokenCreativeDetectorParams;
import io.bidmachine.rendering.model.CacheType;
import io.bidmachine.rendering.model.Color;
import io.bidmachine.rendering.model.ColorBackgroundSource;
import io.bidmachine.rendering.model.ColorPlaceholderSource;
import io.bidmachine.rendering.model.ColorSource;
import io.bidmachine.rendering.model.ElementLayoutParams;
import io.bidmachine.rendering.model.EventParams;
import io.bidmachine.rendering.model.EventTaskParams;
import io.bidmachine.rendering.model.EventTaskType;
import io.bidmachine.rendering.model.EventType;
import io.bidmachine.rendering.model.FontStyleType;
import io.bidmachine.rendering.model.Gradient;
import io.bidmachine.rendering.model.GradientColorSource;
import io.bidmachine.rendering.model.GradientDirection;
import io.bidmachine.rendering.model.GradientType;
import io.bidmachine.rendering.model.HorizontalGravity;
import io.bidmachine.rendering.model.HtmlResourceSource;
import io.bidmachine.rendering.model.Image;
import io.bidmachine.rendering.model.ImageBackgroundSource;
import io.bidmachine.rendering.model.ImagePlaceholderSource;
import io.bidmachine.rendering.model.MeasurerParams;
import io.bidmachine.rendering.model.MethodParams;
import io.bidmachine.rendering.model.NamePlaceholderSource;
import io.bidmachine.rendering.model.OneColorSource;
import io.bidmachine.rendering.model.Padding;
import io.bidmachine.rendering.model.Placeholder;
import io.bidmachine.rendering.model.PlaceholderSource;
import io.bidmachine.rendering.model.Resource;
import io.bidmachine.rendering.model.ResourceSource;
import io.bidmachine.rendering.model.ScaleType;
import io.bidmachine.rendering.model.SideBindParams;
import io.bidmachine.rendering.model.SideType;
import io.bidmachine.rendering.model.StopDetectorAfter;
import io.bidmachine.rendering.model.UrlResourceSource;
import io.bidmachine.rendering.model.VisibilityParams;
import io.bidmachine.rendering.model.XmlResourceSource;
import io.bidmachine.unified.UnifiedAdCallback;
import io.bidmachine.unified.UnifiedMediationParams;
import io.bidmachine.unified.UnifiedParams;
import io.bidmachine.util.Utils;
import io.bidmachine.utils.BMError;
import io.bidmachine.utils.lazy.LazyValue;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.a;
import nj.b0;
import nj.t;
import nj.w;
import qj.b;

/* JADX INFO: compiled from: AdaptiveRenderingParams.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007J\"\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00192\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002J\u0012\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0007J\u0014\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0002J\u0018\u0010'\u001a\u0004\u0018\u00010(2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u001dH\u0002J\u0014\u0010+\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0002J\u0012\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102H\u0007J\u0014\u00103\u001a\u0004\u0018\u0001042\b\u00105\u001a\u0004\u0018\u000106H\u0007J\u0014\u00107\u001a\u0004\u0018\u0001082\b\u00109\u001a\u0004\u0018\u00010:H\u0007J\u0014\u0010;\u001a\u0004\u0018\u00010<2\b\u0010=\u001a\u0004\u0018\u00010>H\u0002J\u0014\u0010?\u001a\u0004\u0018\u00010@2\b\u0010A\u001a\u0004\u0018\u00010BH\u0002J \u0010C\u001a\n\u0012\u0004\u0012\u00020D\u0018\u00010\u001d2\u000e\u0010E\u001a\n\u0012\u0004\u0012\u00020F\u0018\u00010\u001dH\u0007J\u0014\u0010G\u001a\u0004\u0018\u00010H2\b\u0010I\u001a\u0004\u0018\u00010JH\u0002J\u0014\u0010K\u001a\u0004\u0018\u00010L2\b\u0010M\u001a\u0004\u0018\u00010NH\u0002J\u0010\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020RH\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006S"}, d2 = {"Lio/bidmachine/ads/networks/adaptiverendering/AdaptiveRenderingParams;", "Lio/bidmachine/unified/UnifiedParams;", "unifiedMediationParams", "Lio/bidmachine/unified/UnifiedMediationParams;", "(Lio/bidmachine/unified/UnifiedMediationParams;)V", "adParams", "Lio/bidmachine/rendering/model/AdParams;", "getAdParams", "()Lio/bidmachine/rendering/model/AdParams;", "createAdElementParams", "Lio/bidmachine/rendering/model/AdElementParams;", "viewComponent", "Lio/bidmachine/protobuf/rendering/Rendering$Phase$ViewComponent;", "measurerFactory", "Lio/bidmachine/rendering/measurer/MeasurerFactory;", "createAdParams", "rendering", "Lio/bidmachine/protobuf/rendering/Rendering;", C3537j8.f29265s, "Lio/bidmachine/rendering/model/VisibilityParams;", "createAdPhaseParams", "Lio/bidmachine/rendering/model/AdPhaseParams;", TypedValues.CycleType.S_WAVE_PHASE, "Lio/bidmachine/protobuf/rendering/Rendering$Phase;", "createAnimationMap", "", "Lio/bidmachine/rendering/model/AnimationEventType;", "Lio/bidmachine/rendering/model/AnimationParams;", "adaptiveAnimationList", "", "Lio/bidmachine/protobuf/rendering/Rendering$AdaptiveAnimation;", "createAppearanceParams", "Lio/bidmachine/rendering/model/AppearanceParams;", "appearance", "Lio/bidmachine/protobuf/rendering/Rendering$Phase$ViewComponent$Appearance;", "createBackground", "Lio/bidmachine/rendering/model/Background;", A2.f54950g, "Lio/bidmachine/protobuf/rendering/Rendering$Background;", "createBrokenCreativeDetectorParams", "Lio/bidmachine/rendering/model/BrokenCreativeDetectorParams;", "featureList", "Lio/bidmachine/protobuf/rendering/RenderingFeature;", "createColor", "Lio/bidmachine/rendering/model/Color;", "color", "Lio/bidmachine/protobuf/rendering/Rendering$Color;", "createElementLayoutParams", "Lio/bidmachine/rendering/model/ElementLayoutParams;", "layout", "Lio/bidmachine/protobuf/rendering/Rendering$Phase$ViewComponent$Layout;", "createEventParams", "Lio/bidmachine/rendering/model/EventParams;", "event", "Lio/bidmachine/protobuf/rendering/Rendering$Phase$Event;", "createEventTaskParams", "Lio/bidmachine/rendering/model/EventTaskParams;", "task", "Lio/bidmachine/protobuf/rendering/Rendering$Phase$Event$Task;", "createGradient", "Lio/bidmachine/rendering/model/Gradient;", "gradient", "Lio/bidmachine/protobuf/rendering/Rendering$Color$Gradient;", "createImage", "Lio/bidmachine/rendering/model/Image;", "image", "Lio/bidmachine/protobuf/rendering/Rendering$Image;", "createMeasurerParamsList", "Lio/bidmachine/rendering/model/MeasurerParams;", "measurerList", "Lio/bidmachine/protobuf/rendering/Rendering$Phase$ViewComponent$Measurer;", "createPlaceholder", "Lio/bidmachine/rendering/model/Placeholder;", "placeholder", "Lio/bidmachine/protobuf/rendering/Rendering$Placeholder;", "createResource", "Lio/bidmachine/rendering/model/Resource;", "resource", "Lio/bidmachine/protobuf/rendering/Rendering$Resource;", "isValid", "", "callback", "Lio/bidmachine/unified/UnifiedAdCallback;", "bidmachine-android-sdk_bi_3_3_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AdaptiveRenderingParams extends UnifiedParams {
    private final AdParams adParams;

    /* JADX INFO: compiled from: AdaptiveRenderingParams.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Rendering.Phase.ViewComponent.Layout.Constraint.Anchor.values().length];
            try {
                iArr[Rendering.Phase.ViewComponent.Layout.Constraint.Anchor.ANCHOR_WIDTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Rendering.Phase.ViewComponent.Layout.Constraint.Anchor.ANCHOR_HEIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Rendering.Phase.ViewComponent.Layout.Constraint.Anchor.ANCHOR_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Rendering.Phase.ViewComponent.Layout.Constraint.Anchor.ANCHOR_TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Rendering.Phase.ViewComponent.Layout.Constraint.Anchor.ANCHOR_RIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Rendering.Phase.ViewComponent.Layout.Constraint.Anchor.ANCHOR_BOTTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Rendering.Phase.ViewComponent.Layout.Constraint.Anchor.ANCHOR_CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Rendering.Phase.ViewComponent.Layout.Constraint.Anchor.ANCHOR_CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final Background createBackground(Rendering.Background background) {
        BackgroundSource imageBackgroundSource = null;
        if (background == null || background == Rendering.Background.getDefaultInstance()) {
            return null;
        }
        if (background.hasColor()) {
            Color colorCreateColor = createColor(background.getColor());
            if (colorCreateColor != null) {
                imageBackgroundSource = new ColorBackgroundSource(colorCreateColor);
            } else {
                Logger.e((LazyValue<String>) new LazyValue() { // from class: df.e
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        return AdaptiveRenderingParams.createBackground$lambda$18();
                    }
                });
            }
        } else if (background.hasImage()) {
            Image imageCreateImage = createImage(background.getImage());
            if (imageCreateImage != null) {
                imageBackgroundSource = new ImageBackgroundSource(imageCreateImage);
            } else {
                Logger.e((LazyValue<String>) new LazyValue() { // from class: df.f
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        return AdaptiveRenderingParams.createBackground$lambda$19();
                    }
                });
            }
        } else {
            Logger.e((LazyValue<String>) new LazyValue() { // from class: df.g
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    return AdaptiveRenderingParams.createBackground$lambda$20();
                }
            });
        }
        return new Background((float) background.getOpacity(), imageBackgroundSource, createPlaceholder(background.getPlaceholder()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createBackground$lambda$18() {
        return "BackgroundSource don't found. Can't create Color";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createBackground$lambda$19() {
        return "BackgroundSource don't found. Can't create Image";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createBackground$lambda$20() {
        return "BackgroundSource don't found. Set one of: color, gradient";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createBrokenCreativeDetectorParams$lambda$36() {
        return "BrokenCreativeDetector algorithms is empty";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createBrokenCreativeDetectorParams$lambda$37() {
        return "Not all BrokenCreativeDetector algorithms were applied, check if the algorithms are specified correctly";
    }

    private final Color createColor(Rendering.Color color) {
        ColorSource gradientColorSource;
        if (color == null || color == Rendering.Color.getDefaultInstance()) {
            return null;
        }
        if (color.hasColor()) {
            Integer colorSafely = Utils.parseColorSafely(color.getColor());
            if (colorSafely == null) {
                Logger.e((LazyValue<String>) new LazyValue() { // from class: df.h
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        return AdaptiveRenderingParams.createColor$lambda$21();
                    }
                });
                return null;
            }
            gradientColorSource = new OneColorSource(colorSafely.intValue());
        } else if (color.hasGradient()) {
            Gradient gradientCreateGradient = createGradient(color.getGradient());
            if (gradientCreateGradient == null) {
                Logger.e((LazyValue<String>) new LazyValue() { // from class: df.i
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        return AdaptiveRenderingParams.createColor$lambda$22();
                    }
                });
                return null;
            }
            gradientColorSource = new GradientColorSource(gradientCreateGradient);
        } else {
            Logger.e((LazyValue<String>) new LazyValue() { // from class: df.j
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    return AdaptiveRenderingParams.createColor$lambda$23();
                }
            });
            gradientColorSource = null;
        }
        if (gradientColorSource == null) {
            return null;
        }
        return new Color(gradientColorSource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createColor$lambda$21() {
        return "ColorSource don't found. Can't parse color";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createColor$lambda$22() {
        return "ColorSource don't found. Can't create Gradient";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createColor$lambda$23() {
        return "ColorSource don't found. Set one of: color, gradient";
    }

    private final Gradient createGradient(Rendering.Color.Gradient gradient) {
        if (gradient == null || gradient == Rendering.Color.Gradient.getDefaultInstance()) {
            return null;
        }
        final String type = gradient.getType();
        p.i(type, "gradient.type");
        GradientType gradientType = GradientType.INSTANCE.get(type);
        if (gradientType == null) {
            Logger.e((LazyValue<String>) new LazyValue() { // from class: df.m
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    return AdaptiveRenderingParams.createGradient$lambda$24(type);
                }
            });
            return null;
        }
        final String direction = gradient.getDirection();
        p.i(direction, "gradient.direction");
        GradientDirection gradientDirection = GradientDirection.INSTANCE.get(direction);
        if (gradientDirection == null) {
            Logger.e((LazyValue<String>) new LazyValue() { // from class: df.n
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    return AdaptiveRenderingParams.createGradient$lambda$25(direction);
                }
            });
            return null;
        }
        ProtocolStringList colorsList = gradient.getColorsList();
        p.i(colorsList, "gradient.colorsList");
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = colorsList.iterator();
        while (it.hasNext()) {
            Integer colorSafely = Utils.parseColorSafely(it.next());
            if (colorSafely != null) {
                arrayList.add(colorSafely);
            }
        }
        if (arrayList.isEmpty()) {
            Logger.e((LazyValue<String>) new LazyValue() { // from class: df.o
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    return AdaptiveRenderingParams.createGradient$lambda$27();
                }
            });
            return null;
        }
        if (arrayList.size() != colorsList.size()) {
            Logger.e((LazyValue<String>) new LazyValue() { // from class: df.p
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    return AdaptiveRenderingParams.createGradient$lambda$28();
                }
            });
        }
        return new Gradient(gradientType, gradientDirection, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createGradient$lambda$27() {
        return "Failed to parse all colors. Check if colors are specified correctly.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createGradient$lambda$28() {
        return "Not all colors were parsed, check if the colors are specified correctly";
    }

    private final Image createImage(Rendering.Image image) {
        Resource resourceCreateResource;
        if (image == null || image == Rendering.Image.getDefaultInstance() || (resourceCreateResource = createResource(image.getResource())) == null) {
            return null;
        }
        ScaleType scaleType = AdaptiveRenderingParamsKt.toScaleType(image.getScale());
        if (scaleType == null) {
            scaleType = ScaleType.None;
        }
        return new Image(scaleType, resourceCreateResource);
    }

    private final Placeholder createPlaceholder(Rendering.Placeholder placeholder) {
        PlaceholderSource imagePlaceholderSource;
        if (placeholder == null || placeholder == Rendering.Placeholder.getDefaultInstance()) {
            return null;
        }
        if (placeholder.hasName()) {
            String name = placeholder.getName();
            p.i(name, "placeholder.name");
            imagePlaceholderSource = new NamePlaceholderSource(name);
        } else if (placeholder.hasColor()) {
            Color colorCreateColor = createColor(placeholder.getColor());
            if (colorCreateColor == null) {
                return null;
            }
            imagePlaceholderSource = new ColorPlaceholderSource(colorCreateColor);
        } else if (placeholder.hasImage()) {
            Image imageCreateImage = createImage(placeholder.getImage());
            if (imageCreateImage == null) {
                return null;
            }
            imagePlaceholderSource = new ImagePlaceholderSource(imageCreateImage);
        } else {
            Logger.e((LazyValue<String>) new LazyValue() { // from class: df.a
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    return AdaptiveRenderingParams.createPlaceholder$lambda$31();
                }
            });
            imagePlaceholderSource = null;
        }
        if (imagePlaceholderSource == null) {
            return null;
        }
        return new Placeholder(imagePlaceholderSource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createPlaceholder$lambda$31() {
        return "PlaceholderSource don't found. Set one of: name, color, gradient";
    }

    private final Resource createResource(Rendering.Resource resource) {
        ResourceSource xmlResourceSource;
        if (resource == null || resource == Rendering.Resource.getDefaultInstance()) {
            return null;
        }
        if (resource.hasBase64()) {
            String base64 = resource.getBase64();
            p.i(base64, "resource.base64");
            xmlResourceSource = new Base64ResourceSource(base64);
        } else if (resource.hasUrl()) {
            String url = resource.getUrl();
            p.i(url, "resource.url");
            xmlResourceSource = new UrlResourceSource(url);
        } else {
            if (resource.hasPayload()) {
                Rendering.Resource.Payload payload = resource.getPayload();
                p.i(payload, "resource.payload");
                if (payload.hasHtml()) {
                    String html = payload.getHtml();
                    p.i(html, "payload.html");
                    xmlResourceSource = new HtmlResourceSource(html);
                } else if (payload.hasXml()) {
                    String xml = payload.getXml();
                    p.i(xml, "payload.xml");
                    xmlResourceSource = new XmlResourceSource(xml);
                } else {
                    Logger.e((LazyValue<String>) new LazyValue() { // from class: df.b
                        @Override // io.bidmachine.utils.lazy.LazyValue
                        public final Object get() {
                            return AdaptiveRenderingParams.createResource$lambda$29();
                        }
                    });
                }
            } else {
                Logger.e((LazyValue<String>) new LazyValue() { // from class: df.c
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        return AdaptiveRenderingParams.createResource$lambda$30();
                    }
                });
            }
            xmlResourceSource = null;
        }
        if (xmlResourceSource == null) {
            return null;
        }
        return new Resource(xmlResourceSource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createResource$lambda$29() {
        return "ResourceSource don't found. Set one of: html, xml";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createResource$lambda$30() {
        return "ResourceSource don't found. Set one of: base64, url, payload";
    }

    @VisibleForTesting
    public final EventParams createEventParams(Rendering.Phase.Event event) {
        EventType eventType;
        if (event == null || event == Rendering.Phase.Event.getDefaultInstance() || (eventType = AdaptiveRenderingParamsKt.toEventType(event.getName())) == null) {
            return null;
        }
        List<Rendering.Phase.Event.Task> tasksList = event.getTasksList();
        p.i(tasksList, "event.tasksList");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = tasksList.iterator();
        while (it.hasNext()) {
            EventTaskParams eventTaskParamsCreateEventTaskParams = createEventTaskParams((Rendering.Phase.Event.Task) it.next());
            if (eventTaskParamsCreateEventTaskParams != null) {
                arrayList.add(eventTaskParamsCreateEventTaskParams);
            }
        }
        String source = event.getSource();
        p.i(source, "event.source");
        return new EventParams(eventType, source, arrayList);
    }

    @VisibleForTesting
    public final EventTaskParams createEventTaskParams(Rendering.Phase.Event.Task task) {
        EventTaskType eventTaskType;
        if (task == null || task == Rendering.Phase.Event.Task.getDefaultInstance() || (eventTaskType = AdaptiveRenderingParamsKt.toEventTaskType(task.getName())) == null) {
            return null;
        }
        String target = task.getTarget();
        p.i(target, "task.target");
        String value = task.getValue();
        ProtocolStringList stateGroupsList = task.getStateGroupsList();
        p.i(stateGroupsList, "task.stateGroupsList");
        return new EventTaskParams(eventTaskType, target, value, b0.O0(stateGroupsList));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdaptiveRenderingParams(UnifiedMediationParams unifiedMediationParams) {
        super(unifiedMediationParams);
        p.j(unifiedMediationParams, "unifiedMediationParams");
        Object objectOrNull = unifiedMediationParams.getObjectOrNull(UnifiedMediationParams.KEY_RENDERING_CONFIGURATION);
        if (!(objectOrNull instanceof Rendering)) {
            this.adParams = null;
            return;
        }
        VisibilityParams.Builder builder = new VisibilityParams.Builder();
        Float floatOrNull = unifiedMediationParams.getFloatOrNull(UnifiedMediationParams.KEY_VIEWABILITY_PIXEL_THRESHOLD);
        if (floatOrNull != null) {
            builder.setVisibilityPercent(floatOrNull.floatValue());
        }
        Boolean booleanOrNull = unifiedMediationParams.getBooleanOrNull(UnifiedMediationParams.KEY_VIEWABILITY_IGNORE_WINDOW_FOCUS);
        if (booleanOrNull != null) {
            builder.setIgnoreWindowFocus(booleanOrNull.booleanValue());
        }
        Boolean booleanOrNull2 = unifiedMediationParams.getBooleanOrNull(UnifiedMediationParams.KEY_VIEWABILITY_IGNORE_OVERLAP);
        if (booleanOrNull2 != null) {
            builder.setIgnoreOverlap(booleanOrNull2.booleanValue());
        }
        this.adParams = createAdParams((Rendering) objectOrNull, builder.build());
    }

    private final Map<AnimationEventType, AnimationParams> createAnimationMap(List<Rendering.AdaptiveAnimation> adaptiveAnimationList) {
        AnimationParams animationParams;
        HashMap map = new HashMap();
        for (Rendering.AdaptiveAnimation adaptiveAnimation : adaptiveAnimationList) {
            AnimationEventType animationEventType = AnimationEventType.INSTANCE.get(adaptiveAnimation.getEvent());
            if (animationEventType != null) {
                Rendering.AdaptiveAnimation.Style style = adaptiveAnimation.getStyle();
                p.i(style, "it.style");
                if (style.hasFade()) {
                    Rendering.AdaptiveAnimation.FadeAnimationOption fade = style.getFade();
                    p.i(fade, "style.fade");
                    Rendering.AdaptiveAnimation.Timing timing = fade.getTiming();
                    p.i(timing, "fadeAnimationOption.timing");
                    animationParams = new AnimationParams(animationEventType, AnimationStyleType.Fade, AnimationFunctionType.INSTANCE.get(timing.getFunction()), AdaptiveRenderingParamsKt.getDurationMs(timing), null);
                } else if (style.hasSlide()) {
                    Rendering.AdaptiveAnimation.SlideAnimationOption slide = style.getSlide();
                    p.i(slide, "style.slide");
                    Rendering.AdaptiveAnimation.Timing timing2 = slide.getTiming();
                    p.i(timing2, "slideAnimationOption.timing");
                    animationParams = new AnimationParams(animationEventType, AnimationStyleType.Slide, AnimationFunctionType.INSTANCE.get(timing2.getFunction()), AdaptiveRenderingParamsKt.getDurationMs(timing2), AnimationDirectionType.INSTANCE.get(slide.getDirection()));
                }
                map.put(animationEventType, animationParams);
            }
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createElementLayoutParams$lambda$17$lambda$16(Rendering.Phase.ViewComponent.Layout.Constraint.Anchor anchor) {
        return "Unsupported SourceAnchor - " + anchor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createGradient$lambda$24(String str) {
        p.j(str, "$type");
        return "Incorrect gradient type parameter - " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createGradient$lambda$25(String str) {
        p.j(str, "$direction");
        return "Incorrect gradient direction parameter - " + str;
    }

    @VisibleForTesting
    public final AdElementParams createAdElementParams(Rendering.Phase.ViewComponent viewComponent, MeasurerFactory measurerFactory) {
        AdElementType adElementType;
        if (viewComponent == null || viewComponent == Rendering.Phase.ViewComponent.getDefaultInstance() || (adElementType = AdaptiveRenderingParamsKt.toAdElementType(viewComponent.getType())) == null) {
            return null;
        }
        String text = viewComponent.getText();
        p.i(text, "it");
        String str = text.length() > 0 ? text : null;
        String name = viewComponent.getName();
        p.i(name, "viewComponent.name");
        Resource resourceCreateResource = createResource(viewComponent.getResource());
        String source = viewComponent.getSource();
        String placeholder = viewComponent.getPlaceholder();
        ElementLayoutParams elementLayoutParamsCreateElementLayoutParams = createElementLayoutParams(viewComponent.getLayout());
        AppearanceParams appearanceParamsCreateAppearanceParams = createAppearanceParams(viewComponent.getAppearance());
        Map<String, String> customParamsMap = viewComponent.getCustomParamsMap();
        p.i(customParamsMap, "viewComponent.customParamsMap");
        List<Rendering.AdaptiveAnimation> animationsList = viewComponent.getAppearance().getAnimationsList();
        p.i(animationsList, "viewComponent.appearance.animationsList");
        Map<AnimationEventType, AnimationParams> mapCreateAnimationMap = createAnimationMap(animationsList);
        List<MeasurerParams> listCreateMeasurerParamsList = createMeasurerParamsList(viewComponent.getMeasurersList());
        List<RenderingFeature> featuresList = viewComponent.getFeaturesList();
        p.i(featuresList, "viewComponent.featuresList");
        return new AdElementParams(adElementType, name, resourceCreateResource, source, placeholder, str, elementLayoutParamsCreateElementLayoutParams, appearanceParamsCreateAppearanceParams, customParamsMap, mapCreateAnimationMap, measurerFactory, listCreateMeasurerParamsList, createBrokenCreativeDetectorParams(featuresList));
    }

    @VisibleForTesting
    public final AdParams createAdParams(Rendering rendering, VisibilityParams visibilityParams) {
        p.j(rendering, "rendering");
        p.j(visibilityParams, C3537j8.f29265s);
        AdMeasurerFactory adMeasurerFactory = new AdMeasurerFactory();
        AdParams.Builder customParams = new AdParams.Builder().setOrientation(AdaptiveRenderingParamsKt.toOrientation(rendering.getOrientation())).setBackground(createBackground(rendering.getBackground())).setVisibilityParams(visibilityParams).setCustomParams(rendering.getCustomParamsMap());
        CacheType cacheType = AdaptiveRenderingParamsKt.toCacheType(rendering.getCacheType());
        if (cacheType != null) {
            customParams.setCacheType(cacheType);
        }
        List<Rendering.Phase> phasesList = rendering.getPhasesList();
        p.i(phasesList, "rendering.phasesList");
        List<Rendering.Phase> listR0 = b0.R0(phasesList);
        if (listR0.size() > 1) {
            w.B(listR0, new Comparator() { // from class: io.bidmachine.ads.networks.adaptiverendering.AdaptiveRenderingParams$createAdParams$lambda$5$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    return b.d(Integer.valueOf(((Rendering.Phase) t10).getSequence()), Integer.valueOf(((Rendering.Phase) t11).getSequence()));
                }
            });
        }
        for (Rendering.Phase phase : listR0) {
            AdPhaseParams adPhaseParamsCreateAdPhaseParams = createAdPhaseParams(phase, adMeasurerFactory);
            if (adPhaseParamsCreateAdPhaseParams != null) {
                if (phase.getSequence() == -1) {
                    customParams.setPlaceholderParams(adPhaseParamsCreateAdPhaseParams);
                } else {
                    customParams.addAdPhaseParams(adPhaseParamsCreateAdPhaseParams);
                }
            }
        }
        return customParams.build();
    }

    @VisibleForTesting
    public final AdPhaseParams createAdPhaseParams(Rendering.Phase phase, MeasurerFactory measurerFactory) {
        if (phase == null || phase == Rendering.Phase.getDefaultInstance()) {
            return null;
        }
        AdPhaseParams.Builder background = new AdPhaseParams.Builder(phase.getSequence()).setBackground(createBackground(phase.getBackground()));
        List<Rendering.AdaptiveAnimation> animationsList = phase.getAnimationsList();
        p.i(animationsList, "phase.animationsList");
        AdPhaseParams.Builder animationParams = background.setAnimationParams(a.B(createAnimationMap(animationsList)));
        ProtocolStringList stateGroupsList = phase.getStateGroupsList();
        p.i(stateGroupsList, "phase.stateGroupsList");
        AdPhaseParams.Builder customParams = animationParams.setStateGroups(b0.R0(stateGroupsList)).setCustomParams(phase.getCustomParamsMap());
        Integer colorSafely = Utils.parseColorSafely(phase.getBackgroundColor());
        if (colorSafely != null) {
            customParams.setBackgroundColor(colorSafely.intValue());
        }
        List<Rendering.Phase.ViewComponent> adsList = phase.getAdsList();
        p.i(adsList, "phase.adsList");
        Iterator<T> it = adsList.iterator();
        while (it.hasNext()) {
            AdElementParams adElementParamsCreateAdElementParams = createAdElementParams((Rendering.Phase.ViewComponent) it.next(), measurerFactory);
            if (adElementParamsCreateAdElementParams != null) {
                customParams.addAdsElementParams(adElementParamsCreateAdElementParams);
            }
        }
        List<Rendering.Phase.ViewComponent> controlsList = phase.getControlsList();
        p.i(controlsList, "phase.controlsList");
        Iterator<T> it2 = controlsList.iterator();
        while (it2.hasNext()) {
            AdElementParams adElementParamsCreateAdElementParams2 = createAdElementParams((Rendering.Phase.ViewComponent) it2.next(), measurerFactory);
            if (adElementParamsCreateAdElementParams2 != null) {
                customParams.addControlsElementParams(adElementParamsCreateAdElementParams2);
            }
        }
        List<Rendering.Phase.Event> eventsList = phase.getEventsList();
        p.i(eventsList, "phase.eventsList");
        Iterator<T> it3 = eventsList.iterator();
        while (it3.hasNext()) {
            EventParams eventParamsCreateEventParams = createEventParams((Rendering.Phase.Event) it3.next());
            if (eventParamsCreateEventParams != null) {
                customParams.addEventParams(eventParamsCreateEventParams);
            }
        }
        List<Rendering.Phase.MethodComponent> methodsList = phase.getMethodsList();
        p.i(methodsList, "phase.methodsList");
        Iterator<T> it4 = methodsList.iterator();
        while (it4.hasNext()) {
            String name = ((Rendering.Phase.MethodComponent) it4.next()).getName();
            p.i(name, "methodComponent.name");
            customParams.addMethodParams(new MethodParams(name));
        }
        return customParams.build();
    }

    @VisibleForTesting
    public final AppearanceParams createAppearanceParams(Rendering.Phase.ViewComponent.Appearance appearance) {
        if (appearance == null || appearance == Rendering.Phase.ViewComponent.Appearance.getDefaultInstance()) {
            return new AppearanceParams(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
        }
        Background backgroundCreateBackground = createBackground(appearance.getBackground());
        Integer colorSafely = Utils.parseColorSafely(appearance.getBackgroundColor());
        Boolean boolValueOf = Boolean.valueOf(appearance.getVisible());
        Boolean boolValueOf2 = Boolean.valueOf(appearance.getClickable());
        Float fValueOf = Float.valueOf((float) appearance.getOpacity());
        Float fValueOf2 = Float.valueOf((float) appearance.getFontSize());
        FontStyleType fontStyleType = FontStyleType.INSTANCE.get(appearance.getFontStyle());
        Boolean boolValueOf3 = Boolean.valueOf(appearance.getOutlined());
        Float fValueOf3 = Float.valueOf((float) appearance.getStrokeWidth());
        Integer colorSafely2 = Utils.parseColorSafely(appearance.getStrokeColor());
        Integer colorSafely3 = Utils.parseColorSafely(appearance.getFillColor());
        Integer colorSafely4 = Utils.parseColorSafely(appearance.getShadowColor());
        Padding padding = Padding.INSTANCE.parse(appearance.getPadding());
        Float fValueOf4 = Float.valueOf((float) appearance.getCornerRadius());
        Integer numValueOf = Integer.valueOf(appearance.getTextNumberOfLines());
        Float fValueOf5 = Float.valueOf((float) appearance.getTextLineSpacing());
        HorizontalGravity horizontalGravity = HorizontalGravity.INSTANCE.get(appearance.getTextAlignment());
        if (horizontalGravity == null) {
            horizontalGravity = HorizontalGravity.Center;
        }
        return new AppearanceParams(backgroundCreateBackground, colorSafely, boolValueOf, boolValueOf2, fValueOf, fValueOf2, fontStyleType, boolValueOf3, fValueOf3, colorSafely2, colorSafely3, colorSafely4, padding, fValueOf4, numValueOf, fValueOf5, horizontalGravity);
    }

    @VisibleForTesting
    public final ElementLayoutParams createElementLayoutParams(Rendering.Phase.ViewComponent.Layout layout) {
        ElementLayoutParams.Builder builder = new ElementLayoutParams.Builder();
        if (layout == null) {
            return builder.build();
        }
        List<Rendering.Phase.ViewComponent.Layout.Constraint> constraintsList = layout.getConstraintsList();
        p.i(constraintsList, "layout.constraintsList");
        for (Rendering.Phase.ViewComponent.Layout.Constraint constraint : constraintsList) {
            final Rendering.Phase.ViewComponent.Layout.Constraint.Anchor sourceAnchor = constraint.getSourceAnchor();
            Rendering.Phase.ViewComponent.Layout.Constraint.Anchor targetAnchor = constraint.getTargetAnchor();
            String target = constraint.getTarget();
            p.i(target, "constraint.target");
            float value = (float) constraint.getValue();
            switch (sourceAnchor == null ? -1 : WhenMappings.$EnumSwitchMapping$0[sourceAnchor.ordinal()]) {
                case 1:
                    builder.setWidth(value);
                    builder.setWidthPercent((float) constraint.getMultiplier());
                    break;
                case 2:
                    builder.setHeight(value);
                    builder.setHeightPercent((float) constraint.getMultiplier());
                    break;
                case 3:
                    SideType sideType = AdaptiveRenderingParamsKt.toSideType(targetAnchor);
                    if (sideType != null) {
                        builder.setLeftSideBindParams(new SideBindParams(sideType, target));
                    }
                    builder.setMarginLeft(value);
                    break;
                case 4:
                    SideType sideType2 = AdaptiveRenderingParamsKt.toSideType(targetAnchor);
                    if (sideType2 != null) {
                        builder.setTopSideBindParams(new SideBindParams(sideType2, target));
                    }
                    builder.setMarginTop(value);
                    break;
                case 5:
                    SideType sideType3 = AdaptiveRenderingParamsKt.toSideType(targetAnchor);
                    if (sideType3 != null) {
                        builder.setRightSideBindParams(new SideBindParams(sideType3, target));
                    }
                    builder.setMarginRight(value);
                    break;
                case 6:
                    SideType sideType4 = AdaptiveRenderingParamsKt.toSideType(targetAnchor);
                    if (sideType4 != null) {
                        builder.setBottomSideBindParams(new SideBindParams(sideType4, target));
                    }
                    builder.setMarginBottom(value);
                    break;
                case 7:
                    builder.setTranslationX(value);
                    break;
                case 8:
                    builder.setTranslationY(value);
                    break;
                default:
                    Logger.e((LazyValue<String>) new LazyValue() { // from class: df.d
                        @Override // io.bidmachine.utils.lazy.LazyValue
                        public final Object get() {
                            return AdaptiveRenderingParams.createElementLayoutParams$lambda$17$lambda$16(sourceAnchor);
                        }
                    });
                    break;
            }
        }
        return builder.build();
    }

    @VisibleForTesting
    public final List<MeasurerParams> createMeasurerParamsList(List<Rendering.Phase.ViewComponent.Measurer> measurerList) {
        if (measurerList == null || measurerList.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(t.v(measurerList, 10));
        for (Rendering.Phase.ViewComponent.Measurer measurer : measurerList) {
            String name = measurer.getName();
            p.i(name, "it.name");
            arrayList.add(new MeasurerParams(name, measurer.getParametersMap()));
        }
        return arrayList;
    }

    public final AdParams getAdParams() {
        return this.adParams;
    }

    @Override // io.bidmachine.unified.UnifiedParams
    public boolean isValid(UnifiedAdCallback callback) {
        p.j(callback, "callback");
        if (this.adParams != null) {
            return true;
        }
        callback.onAdLoadFailed(BMError.notFound(UnifiedMediationParams.KEY_RENDERING_CONFIGURATION));
        return false;
    }

    private final BrokenCreativeDetectorParams createBrokenCreativeDetectorParams(List<RenderingFeature> featureList) {
        Object next;
        RenderingFeature.BrokenCreativeDetector.Configuration configuration;
        BrokenCreativeAlgorithmParams brokenCreativeAlgorithmParams;
        RenderingFeature.BrokenCreativeDetector brokenCreativeDetector;
        boolean z10;
        if (featureList.isEmpty()) {
            return null;
        }
        Iterator<T> it = featureList.iterator();
        do {
            if (it.hasNext()) {
                next = it.next();
                RenderingFeature renderingFeature = (RenderingFeature) next;
                if (renderingFeature.hasBrokenCreativeDetector() && renderingFeature.getBrokenCreativeDetector().hasConfiguration()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                next = null;
                break;
            }
        } while (!z10);
        RenderingFeature renderingFeature2 = (RenderingFeature) next;
        if (renderingFeature2 != null && (brokenCreativeDetector = renderingFeature2.getBrokenCreativeDetector()) != null) {
            configuration = brokenCreativeDetector.getConfiguration();
        } else {
            configuration = null;
        }
        if (configuration == null) {
            return null;
        }
        List<RenderingFeature.BrokenCreativeDetector.Algorithm> algorithmsList = configuration.getAlgorithmsList();
        p.i(algorithmsList, "brokenCreativeDetectorConfiguration.algorithmsList");
        ArrayList arrayList = new ArrayList();
        for (RenderingFeature.BrokenCreativeDetector.Algorithm algorithm : algorithmsList) {
            BrokenCreativeAlgorithmType brokenCreativeAlgorithmType = BrokenCreativeAlgorithmType.INSTANCE.get(algorithm.getName());
            if (brokenCreativeAlgorithmType == null) {
                brokenCreativeAlgorithmParams = null;
            } else {
                brokenCreativeAlgorithmParams = new BrokenCreativeAlgorithmParams(brokenCreativeAlgorithmType, (float) algorithm.getThreshold(), (float) algorithm.getWeight());
            }
            if (brokenCreativeAlgorithmParams != null) {
                arrayList.add(brokenCreativeAlgorithmParams);
            }
        }
        if (arrayList.isEmpty()) {
            Logger.e((LazyValue<String>) new LazyValue() { // from class: df.k
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    return AdaptiveRenderingParams.createBrokenCreativeDetectorParams$lambda$36();
                }
            });
            return null;
        }
        if (arrayList.size() != algorithmsList.size()) {
            Logger.e((LazyValue<String>) new LazyValue() { // from class: df.l
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    return AdaptiveRenderingParams.createBrokenCreativeDetectorParams$lambda$37();
                }
            });
        }
        long timeout = (long) configuration.getTimeout();
        double downscaleFactor = configuration.getDownscaleFactor();
        boolean errorOnly = configuration.getErrorOnly();
        boolean allowDuplicate = configuration.getAllowDuplicate();
        StopDetectorAfter stopDetectorAfter = StopDetectorAfter.INSTANCE.get(configuration.getStopAfter());
        if (stopDetectorAfter == null) {
            stopDetectorAfter = StopDetectorAfter.AnyCreative;
        }
        return new BrokenCreativeDetectorParams(timeout, downscaleFactor, errorOnly, allowDuplicate, stopDetectorAfter, configuration.getWeightThreshold(), arrayList);
    }
}
