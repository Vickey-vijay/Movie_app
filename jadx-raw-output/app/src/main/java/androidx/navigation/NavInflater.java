package androidx.navigation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.NavigationRes;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import ck.i;
import ck.p;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.io.IOException;
import kotlin.Metadata;
import lk.x;
import me.goldze.mvvmhabit.base.ContainerActivity;
import mj.r;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: NavInflater.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 !2\u00020\u0001:\u0001!B\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010 J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J(\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J \u0010\u0016\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J0\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002J\u0012\u0010\u000b\u001a\u00020\u00182\b\b\u0001\u0010\t\u001a\u00020\bH\u0007R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Landroidx/navigation/NavInflater;", "", "Landroid/content/res/Resources;", "res", "Landroid/content/res/XmlResourceParser;", "parser", "Landroid/util/AttributeSet;", "attrs", "", "graphResId", "Landroidx/navigation/NavDestination;", "inflate", "dest", "Lmj/r;", "inflateArgumentForDestination", "Landroid/os/Bundle;", ContainerActivity.BUNDLE, "inflateArgumentForBundle", "Landroid/content/res/TypedArray;", "a", "Landroidx/navigation/NavArgument;", "inflateArgument", "inflateDeepLink", "inflateAction", "Landroidx/navigation/NavGraph;", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Landroid/content/Context;", "Landroidx/navigation/NavigatorProvider;", "navigatorProvider", "Landroidx/navigation/NavigatorProvider;", "<init>", "(Landroid/content/Context;Landroidx/navigation/NavigatorProvider;)V", VastTagName.COMPANION, "navigation-runtime_release"}, k = 1, mv = {1, 6, 0})
public final class NavInflater {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String APPLICATION_ID_PLACEHOLDER = "${applicationId}";
    private static final String TAG_ACTION = "action";
    private static final String TAG_ARGUMENT = "argument";
    private static final String TAG_DEEP_LINK = "deepLink";
    private static final String TAG_INCLUDE = "include";
    private final Context context;
    private final NavigatorProvider navigatorProvider;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ThreadLocal<TypedValue> sTmpValue = new ThreadLocal<>();

    @SuppressLint({"ResourceType"})
    public final NavGraph inflate(@NavigationRes int graphResId) {
        int next;
        Resources resources = this.context.getResources();
        XmlResourceParser xml = resources.getXml(graphResId);
        p.i(xml, "res.getXml(graphResId)");
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e10) {
                    throw new RuntimeException("Exception inflating " + resources.getResourceName(graphResId) + " line " + xml.getLineNumber(), e10);
                }
            } catch (Throwable th2) {
                xml.close();
                throw th2;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        p.i(resources, "res");
        p.i(attributeSetAsAttributeSet, "attrs");
        NavDestination navDestinationInflate = inflate(resources, xml, attributeSetAsAttributeSet, graphResId);
        if (navDestinationInflate instanceof NavGraph) {
            NavGraph navGraph = (NavGraph) navDestinationInflate;
            xml.close();
            return navGraph;
        }
        throw new IllegalArgumentException(("Root element <" + name + "> did not inflate into a NavGraph").toString());
    }

    /* JADX INFO: compiled from: NavInflater.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JE\u0010\f\u001a\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\u000e\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0013R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Landroidx/navigation/NavInflater$Companion;", "", "()V", "APPLICATION_ID_PLACEHOLDER", "", "TAG_ACTION", "TAG_ARGUMENT", "TAG_DEEP_LINK", "TAG_INCLUDE", "sTmpValue", "Ljava/lang/ThreadLocal;", "Landroid/util/TypedValue;", "checkNavType", "Landroidx/navigation/NavType;", "value", "navType", "expectedNavType", "argType", "foundType", "checkNavType$navigation_runtime_release", "navigation-runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final NavType<?> checkNavType$navigation_runtime_release(TypedValue value, NavType<?> navType, NavType<?> expectedNavType, String argType, String foundType) throws XmlPullParserException {
            p.j(value, "value");
            p.j(expectedNavType, "expectedNavType");
            p.j(foundType, "foundType");
            if (navType != null && navType != expectedNavType) {
                throw new XmlPullParserException("Type is " + argType + " but found " + foundType + ": " + value.data);
            }
            if (navType == null) {
                return expectedNavType;
            }
            return navType;
        }
    }

    public NavInflater(Context context, NavigatorProvider navigatorProvider) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(navigatorProvider, "navigatorProvider");
        this.context = context;
        this.navigatorProvider = navigatorProvider;
    }

    private final void inflateAction(Resources resources, NavDestination navDestination, AttributeSet attributeSet, XmlResourceParser xmlResourceParser, int i10) throws XmlPullParserException, IOException {
        int depth;
        Context context = this.context;
        int[] iArr = androidx.navigation.common.R.styleable.NavAction;
        p.i(iArr, "NavAction");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(androidx.navigation.common.R.styleable.NavAction_android_id, 0);
        NavAction navAction = new NavAction(typedArrayObtainStyledAttributes.getResourceId(androidx.navigation.common.R.styleable.NavAction_destination, 0), null, null, 6, null);
        NavOptions.Builder builder = new NavOptions.Builder();
        builder.setLaunchSingleTop(typedArrayObtainStyledAttributes.getBoolean(androidx.navigation.common.R.styleable.NavAction_launchSingleTop, false));
        builder.setRestoreState(typedArrayObtainStyledAttributes.getBoolean(androidx.navigation.common.R.styleable.NavAction_restoreState, false));
        builder.setPopUpTo(typedArrayObtainStyledAttributes.getResourceId(androidx.navigation.common.R.styleable.NavAction_popUpTo, -1), typedArrayObtainStyledAttributes.getBoolean(androidx.navigation.common.R.styleable.NavAction_popUpToInclusive, false), typedArrayObtainStyledAttributes.getBoolean(androidx.navigation.common.R.styleable.NavAction_popUpToSaveState, false));
        builder.setEnterAnim(typedArrayObtainStyledAttributes.getResourceId(androidx.navigation.common.R.styleable.NavAction_enterAnim, -1));
        builder.setExitAnim(typedArrayObtainStyledAttributes.getResourceId(androidx.navigation.common.R.styleable.NavAction_exitAnim, -1));
        builder.setPopEnterAnim(typedArrayObtainStyledAttributes.getResourceId(androidx.navigation.common.R.styleable.NavAction_popEnterAnim, -1));
        builder.setPopExitAnim(typedArrayObtainStyledAttributes.getResourceId(androidx.navigation.common.R.styleable.NavAction_popExitAnim, -1));
        navAction.setNavOptions(builder.build());
        Bundle bundle = new Bundle();
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && p.e(TAG_ARGUMENT, xmlResourceParser.getName())) {
                inflateArgumentForBundle(resources, bundle, attributeSet, i10);
            }
        }
        if (!bundle.isEmpty()) {
            navAction.setDefaultArguments(bundle);
        }
        navDestination.putAction(resourceId, navAction);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final NavArgument inflateArgument(TypedArray a10, Resources res, int graphResId) throws XmlPullParserException {
        NavArgument.Builder builder = new NavArgument.Builder();
        int i10 = 0;
        builder.setIsNullable(a10.getBoolean(androidx.navigation.common.R.styleable.NavArgument_nullable, false));
        ThreadLocal<TypedValue> threadLocal = sTmpValue;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        String string = a10.getString(androidx.navigation.common.R.styleable.NavArgument_argType);
        Object value = null;
        NavType<Object> navTypeFromArgType = string != null ? NavType.INSTANCE.fromArgType(string, res.getResourcePackageName(graphResId)) : null;
        int i11 = androidx.navigation.common.R.styleable.NavArgument_android_defaultValue;
        if (a10.getValue(i11, typedValue)) {
            NavType<Object> navType = NavType.ReferenceType;
            if (navTypeFromArgType == navType) {
                int i12 = typedValue.resourceId;
                if (i12 != 0) {
                    i10 = i12;
                } else if (typedValue.type != 16 || typedValue.data != 0) {
                    throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + navTypeFromArgType.getName() + ". Must be a reference to a resource.");
                }
                value = Integer.valueOf(i10);
            } else {
                int i13 = typedValue.resourceId;
                if (i13 != 0) {
                    if (navTypeFromArgType != null) {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + navTypeFromArgType.getName() + ". You must use a \"" + navType.getName() + "\" type to reference other resources.");
                    }
                    navTypeFromArgType = navType;
                    value = Integer.valueOf(i13);
                } else if (navTypeFromArgType == NavType.StringType) {
                    value = a10.getString(i11);
                } else {
                    int i14 = typedValue.type;
                    if (i14 == 3) {
                        String string2 = typedValue.string.toString();
                        if (navTypeFromArgType == null) {
                            navTypeFromArgType = NavType.INSTANCE.inferFromValue(string2);
                        }
                        value = navTypeFromArgType.parseValue(string2);
                    } else if (i14 == 4) {
                        navTypeFromArgType = INSTANCE.checkNavType$navigation_runtime_release(typedValue, navTypeFromArgType, NavType.FloatType, string, TypedValues.Custom.S_FLOAT);
                        value = Float.valueOf(typedValue.getFloat());
                    } else if (i14 == 5) {
                        navTypeFromArgType = INSTANCE.checkNavType$navigation_runtime_release(typedValue, navTypeFromArgType, NavType.IntType, string, TypedValues.Custom.S_DIMENSION);
                        value = Integer.valueOf((int) typedValue.getDimension(res.getDisplayMetrics()));
                    } else if (i14 == 18) {
                        navTypeFromArgType = INSTANCE.checkNavType$navigation_runtime_release(typedValue, navTypeFromArgType, NavType.BoolType, string, TypedValues.Custom.S_BOOLEAN);
                        value = Boolean.valueOf(typedValue.data != 0);
                    } else {
                        if (i14 < 16 || i14 > 31) {
                            throw new XmlPullParserException("unsupported argument type " + typedValue.type);
                        }
                        NavType<Object> navType2 = NavType.FloatType;
                        if (navTypeFromArgType == navType2) {
                            navTypeFromArgType = INSTANCE.checkNavType$navigation_runtime_release(typedValue, navTypeFromArgType, navType2, string, TypedValues.Custom.S_FLOAT);
                            value = Float.valueOf(typedValue.data);
                        } else {
                            navTypeFromArgType = INSTANCE.checkNavType$navigation_runtime_release(typedValue, navTypeFromArgType, NavType.IntType, string, TypedValues.Custom.S_INT);
                            value = Integer.valueOf(typedValue.data);
                        }
                    }
                }
            }
        }
        if (value != null) {
            builder.setDefaultValue(value);
        }
        if (navTypeFromArgType != null) {
            builder.setType(navTypeFromArgType);
        }
        return builder.build();
    }

    private final void inflateArgumentForBundle(Resources resources, Bundle bundle, AttributeSet attributeSet, int i10) throws XmlPullParserException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, androidx.navigation.common.R.styleable.NavArgument);
        p.i(typedArrayObtainAttributes, "res.obtainAttributes(att… R.styleable.NavArgument)");
        String string = typedArrayObtainAttributes.getString(androidx.navigation.common.R.styleable.NavArgument_android_name);
        if (string == null) {
            throw new XmlPullParserException("Arguments must have a name");
        }
        p.i(string, "array.getString(R.stylea…uments must have a name\")");
        NavArgument navArgumentInflateArgument = inflateArgument(typedArrayObtainAttributes, resources, i10);
        if (navArgumentInflateArgument.getIsDefaultValuePresent()) {
            navArgumentInflateArgument.putDefaultValue(string, bundle);
        }
        r rVar = r.f64562a;
        typedArrayObtainAttributes.recycle();
    }

    private final void inflateArgumentForDestination(Resources resources, NavDestination navDestination, AttributeSet attributeSet, int i10) throws XmlPullParserException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, androidx.navigation.common.R.styleable.NavArgument);
        p.i(typedArrayObtainAttributes, "res.obtainAttributes(att… R.styleable.NavArgument)");
        String string = typedArrayObtainAttributes.getString(androidx.navigation.common.R.styleable.NavArgument_android_name);
        if (string == null) {
            throw new XmlPullParserException("Arguments must have a name");
        }
        p.i(string, "array.getString(R.stylea…uments must have a name\")");
        navDestination.addArgument(string, inflateArgument(typedArrayObtainAttributes, resources, i10));
        r rVar = r.f64562a;
        typedArrayObtainAttributes.recycle();
    }

    private final void inflateDeepLink(Resources resources, NavDestination navDestination, AttributeSet attributeSet) throws XmlPullParserException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, androidx.navigation.common.R.styleable.NavDeepLink);
        p.i(typedArrayObtainAttributes, "res.obtainAttributes(att… R.styleable.NavDeepLink)");
        String string = typedArrayObtainAttributes.getString(androidx.navigation.common.R.styleable.NavDeepLink_uri);
        String string2 = typedArrayObtainAttributes.getString(androidx.navigation.common.R.styleable.NavDeepLink_action);
        String string3 = typedArrayObtainAttributes.getString(androidx.navigation.common.R.styleable.NavDeepLink_mimeType);
        if (string == null || string.length() == 0) {
            if (string2 == null || string2.length() == 0) {
                if (string3 == null || string3.length() == 0) {
                    throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
                }
            }
        }
        NavDeepLink.Builder builder = new NavDeepLink.Builder();
        if (string != null) {
            String packageName = this.context.getPackageName();
            p.i(packageName, "context.packageName");
            builder.setUriPattern(x.N(string, APPLICATION_ID_PLACEHOLDER, packageName, false, 4, null));
        }
        if (!(string2 == null || string2.length() == 0)) {
            String packageName2 = this.context.getPackageName();
            p.i(packageName2, "context.packageName");
            builder.setAction(x.N(string2, APPLICATION_ID_PLACEHOLDER, packageName2, false, 4, null));
        }
        if (string3 != null) {
            String packageName3 = this.context.getPackageName();
            p.i(packageName3, "context.packageName");
            builder.setMimeType(x.N(string3, APPLICATION_ID_PLACEHOLDER, packageName3, false, 4, null));
        }
        navDestination.addDeepLink(builder.build());
        r rVar = r.f64562a;
        typedArrayObtainAttributes.recycle();
    }

    private final NavDestination inflate(Resources res, XmlResourceParser parser, AttributeSet attrs, int graphResId) throws XmlPullParserException, IOException {
        int depth;
        NavigatorProvider navigatorProvider = this.navigatorProvider;
        String name = parser.getName();
        p.i(name, "parser.name");
        NavDestination navDestinationCreateDestination = navigatorProvider.getNavigator(name).createDestination();
        navDestinationCreateDestination.onInflate(this.context, attrs);
        int depth2 = parser.getDepth() + 1;
        while (true) {
            int next = parser.next();
            if (next == 1 || ((depth = parser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2) {
                String name2 = parser.getName();
                if (p.e(TAG_ARGUMENT, name2)) {
                    inflateArgumentForDestination(res, navDestinationCreateDestination, attrs, graphResId);
                } else if (p.e(TAG_DEEP_LINK, name2)) {
                    inflateDeepLink(res, navDestinationCreateDestination, attrs);
                } else if (p.e("action", name2)) {
                    inflateAction(res, navDestinationCreateDestination, attrs, parser, graphResId);
                } else if (p.e(TAG_INCLUDE, name2) && (navDestinationCreateDestination instanceof NavGraph)) {
                    TypedArray typedArrayObtainAttributes = res.obtainAttributes(attrs, R.styleable.NavInclude);
                    p.i(typedArrayObtainAttributes, "res.obtainAttributes(att…n.R.styleable.NavInclude)");
                    ((NavGraph) navDestinationCreateDestination).addDestination(inflate(typedArrayObtainAttributes.getResourceId(R.styleable.NavInclude_graph, 0)));
                    r rVar = r.f64562a;
                    typedArrayObtainAttributes.recycle();
                } else if (navDestinationCreateDestination instanceof NavGraph) {
                    ((NavGraph) navDestinationCreateDestination).addDestination(inflate(res, parser, attrs, graphResId));
                }
            }
        }
        return navDestinationCreateDestination;
    }
}
