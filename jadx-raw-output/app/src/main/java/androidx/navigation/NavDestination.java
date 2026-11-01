package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.annotation.CallSuper;
import androidx.annotation.IdRes;
import androidx.annotation.RestrictTo;
import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayKt;
import bk.l;
import ck.i;
import ck.p;
import ck.x;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kk.r;
import kotlin.Metadata;
import lk.a0;
import nj.b0;
import nj.n0;
import nj.t;

/* JADX INFO: compiled from: NavDestination.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 _2\u00020\u0001:\u0003`_aB\u000f\u0012\u0006\u0010/\u001a\u00020\u000e¢\u0006\u0004\b[\u0010TB\u0019\b\u0016\u0012\u000e\u0010]\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\\¢\u0006\u0004\b[\u0010^J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\fH\u0017J\u0014\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0000H\u0007J\b\u0010\u0019\u001a\u00020\nH\u0017J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\b\u0001\u0010\u001b\u001a\u00020\u001aJ\u001a\u0010 \u001a\u00020\u00062\b\b\u0001\u0010\u001e\u001a\u00020\u001a2\b\b\u0001\u0010\u001f\u001a\u00020\u001aJ\u0018\u0010 \u001a\u00020\u00062\b\b\u0001\u0010\u001e\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u001cJ\u0010\u0010\"\u001a\u00020\u00062\b\b\u0001\u0010\u001e\u001a\u00020\u001aJ\u0016\u0010&\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020$J\u000e\u0010'\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u000eJ\u0014\u0010*\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010(H\u0007J\b\u0010+\u001a\u00020\u000eH\u0016J\u0013\u0010-\u001a\u00020\n2\b\u0010,\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010.\u001a\u00020\u001aH\u0016R\u0017\u0010/\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R.\u00105\u001a\u0004\u0018\u0001032\b\u00104\u001a\u0004\u0018\u0001038\u0006@GX\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0018\u0010;\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00100R$\u0010=\u001a\u0004\u0018\u00010<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00110C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020\u001c0F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\"\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020$0I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR,\u0010\u001b\u001a\u00020\u001a2\b\b\u0001\u0010\u001b\u001a\u00020\u001a8G@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR.\u0010Q\u001a\u0004\u0018\u00010\u000e2\b\u0010Q\u001a\u0004\u0018\u00010\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u00100\u001a\u0004\bR\u00102\"\u0004\bS\u0010TR\u001d\u0010X\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020$0U8F¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0014\u0010Z\u001a\u00020\u000e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bY\u00102¨\u0006b"}, d2 = {"Landroidx/navigation/NavDestination;", "", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "Lmj/r;", "onInflate", "Landroid/net/Uri;", "deepLink", "", "hasDeepLink", "Landroidx/navigation/NavDeepLinkRequest;", "deepLinkRequest", "", "uriPattern", "addDeepLink", "Landroidx/navigation/NavDeepLink;", "navDeepLink", "navDeepLinkRequest", "Landroidx/navigation/NavDestination$DeepLinkMatch;", "matchDeepLink", "previousDestination", "", "buildDeepLinkIds", "supportsActions", "", "id", "Landroidx/navigation/NavAction;", "getAction", "actionId", "destId", "putAction", "action", "removeAction", "argumentName", "Landroidx/navigation/NavArgument;", "argument", "addArgument", "removeArgument", "Landroid/os/Bundle;", "args", "addInDefaultArgs", "toString", "other", "equals", "hashCode", "navigatorName", "Ljava/lang/String;", "getNavigatorName", "()Ljava/lang/String;", "Landroidx/navigation/NavGraph;", "<set-?>", "parent", "Landroidx/navigation/NavGraph;", "getParent", "()Landroidx/navigation/NavGraph;", "setParent", "(Landroidx/navigation/NavGraph;)V", "idName", "", "label", "Ljava/lang/CharSequence;", "getLabel", "()Ljava/lang/CharSequence;", "setLabel", "(Ljava/lang/CharSequence;)V", "", "deepLinks", "Ljava/util/List;", "Landroidx/collection/SparseArrayCompat;", "actions", "Landroidx/collection/SparseArrayCompat;", "", "_arguments", "Ljava/util/Map;", "I", "getId", "()I", "setId", "(I)V", "route", "getRoute", "setRoute", "(Ljava/lang/String;)V", "", "getArguments", "()Ljava/util/Map;", "arguments", "getDisplayName", "displayName", "<init>", "Landroidx/navigation/Navigator;", "navigator", "(Landroidx/navigation/Navigator;)V", VastTagName.COMPANION, "ClassType", "DeepLinkMatch", "navigation-common_release"}, k = 1, mv = {1, 6, 0})
public class NavDestination {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Map<String, Class<?>> classes = new LinkedHashMap();
    private Map<String, NavArgument> _arguments;
    private final SparseArrayCompat<NavAction> actions;
    private final List<NavDeepLink> deepLinks;
    private int id;
    private String idName;
    private CharSequence label;
    private final String navigatorName;
    private NavGraph parent;
    private String route;

    /* JADX INFO: compiled from: NavDestination.kt */
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\f\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002R\u0015\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/navigation/NavDestination$ClassType;", "", "Ljk/c;", "value", "()Ljava/lang/Class;", "navigation-common_release"}, k = 1, mv = {1, 6, 0})
    @Retention(RetentionPolicy.CLASS)
    public @interface ClassType {
        Class<?> value();
    }

    /* JADX INFO: compiled from: NavDestination.kt */
    @Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ:\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\u0007\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0010\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\u0007H\u0005J:\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\u0007\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0010\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\u0007H\u0007J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0007J\u0012\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u0007R$\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u0011*\u00020\u00108FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Landroidx/navigation/NavDestination$Companion;", "", "C", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "", "name", "Ljava/lang/Class;", "expectedClassType", "parseClassFromName", "parseClassFromNameInternal", "", "id", "getDisplayName", "route", "createRoute", "Landroidx/navigation/NavDestination;", "Lkk/i;", "getHierarchy", "(Landroidx/navigation/NavDestination;)Lkk/i;", "getHierarchy$annotations", "(Landroidx/navigation/NavDestination;)V", "hierarchy", "", "classes", "Ljava/util/Map;", "<init>", "()V", "navigation-common_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public static /* synthetic */ void getHierarchy$annotations(NavDestination navDestination) {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final String createRoute(String route) {
            if (route == null) {
                return "";
            }
            return "android-app://androidx.navigation/" + route;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final String getDisplayName(Context context, int id2) {
            String strValueOf;
            p.j(context, GAMConfig.KEY_CONTEXT);
            if (id2 <= 16777215) {
                return String.valueOf(id2);
            }
            try {
                strValueOf = context.getResources().getResourceName(id2);
            } catch (Resources.NotFoundException unused) {
                strValueOf = String.valueOf(id2);
            }
            p.i(strValueOf, "try {\n                co….toString()\n            }");
            return strValueOf;
        }

        public final kk.i<NavDestination> getHierarchy(NavDestination navDestination) {
            p.j(navDestination, "<this>");
            return r.p(navDestination, new l<NavDestination, NavDestination>() { // from class: androidx.navigation.NavDestination$Companion$hierarchy$1
                @Override // bk.l
                public final NavDestination invoke(NavDestination navDestination2) {
                    p.j(navDestination2, "it");
                    return navDestination2.getParent();
                }
            });
        }

        public final <C> Class<? extends C> parseClassFromName(Context context, String name, Class<? extends C> expectedClassType) {
            String str;
            p.j(context, GAMConfig.KEY_CONTEXT);
            p.j(name, "name");
            p.j(expectedClassType, "expectedClassType");
            if (name.charAt(0) == '.') {
                str = context.getPackageName() + name;
            } else {
                str = name;
            }
            Class<? extends C> cls = (Class) NavDestination.classes.get(str);
            if (cls == null) {
                try {
                    cls = (Class<? extends C>) Class.forName(str, true, context.getClassLoader());
                    NavDestination.classes.put(name, cls);
                } catch (ClassNotFoundException e10) {
                    throw new IllegalArgumentException(e10);
                }
            }
            p.g(cls);
            if (expectedClassType.isAssignableFrom(cls)) {
                return cls;
            }
            throw new IllegalArgumentException((str + " must be a subclass of " + expectedClassType).toString());
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final <C> Class<? extends C> parseClassFromNameInternal(Context context, String name, Class<? extends C> expectedClassType) {
            p.j(context, GAMConfig.KEY_CONTEXT);
            p.j(name, "name");
            p.j(expectedClassType, "expectedClassType");
            return NavDestination.parseClassFromName(context, name, expectedClassType);
        }
    }

    /* JADX INFO: compiled from: NavDestination.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0011\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0000H\u0096\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Landroidx/navigation/NavDestination$DeepLinkMatch;", "", "destination", "Landroidx/navigation/NavDestination;", "matchingArgs", "Landroid/os/Bundle;", "isExactDeepLink", "", "hasMatchingAction", "mimeTypeMatchLevel", "", "(Landroidx/navigation/NavDestination;Landroid/os/Bundle;ZZI)V", "getDestination", "()Landroidx/navigation/NavDestination;", "getMatchingArgs", "()Landroid/os/Bundle;", "compareTo", "other", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class DeepLinkMatch implements Comparable<DeepLinkMatch> {
        private final NavDestination destination;
        private final boolean hasMatchingAction;
        private final boolean isExactDeepLink;
        private final Bundle matchingArgs;
        private final int mimeTypeMatchLevel;

        public DeepLinkMatch(NavDestination navDestination, Bundle bundle, boolean z10, boolean z11, int i10) {
            p.j(navDestination, "destination");
            this.destination = navDestination;
            this.matchingArgs = bundle;
            this.isExactDeepLink = z10;
            this.hasMatchingAction = z11;
            this.mimeTypeMatchLevel = i10;
        }

        @Override // java.lang.Comparable
        public int compareTo(DeepLinkMatch other) {
            p.j(other, "other");
            boolean z10 = this.isExactDeepLink;
            if (z10 && !other.isExactDeepLink) {
                return 1;
            }
            if (!z10 && other.isExactDeepLink) {
                return -1;
            }
            Bundle bundle = this.matchingArgs;
            if (bundle != null && other.matchingArgs == null) {
                return 1;
            }
            if (bundle == null && other.matchingArgs != null) {
                return -1;
            }
            if (bundle != null) {
                int size = bundle.size();
                Bundle bundle2 = other.matchingArgs;
                p.g(bundle2);
                int size2 = size - bundle2.size();
                if (size2 > 0) {
                    return 1;
                }
                if (size2 < 0) {
                    return -1;
                }
            }
            boolean z11 = this.hasMatchingAction;
            if (z11 && !other.hasMatchingAction) {
                return 1;
            }
            if (z11 || !other.hasMatchingAction) {
                return this.mimeTypeMatchLevel - other.mimeTypeMatchLevel;
            }
            return -1;
        }

        public final NavDestination getDestination() {
            return this.destination;
        }

        public final Bundle getMatchingArgs() {
            return this.matchingArgs;
        }
    }

    public NavDestination(String str) {
        p.j(str, "navigatorName");
        this.navigatorName = str;
        this.deepLinks = new ArrayList();
        this.actions = new SparseArrayCompat<>();
        this._arguments = new LinkedHashMap();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String getDisplayName(Context context, int i10) {
        return INSTANCE.getDisplayName(context, i10);
    }

    public static final kk.i<NavDestination> getHierarchy(NavDestination navDestination) {
        return INSTANCE.getHierarchy(navDestination);
    }

    public static final <C> Class<? extends C> parseClassFromName(Context context, String str, Class<? extends C> cls) {
        return INSTANCE.parseClassFromName(context, str, cls);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <C> Class<? extends C> parseClassFromNameInternal(Context context, String str, Class<? extends C> cls) {
        return INSTANCE.parseClassFromNameInternal(context, str, cls);
    }

    public final void addDeepLink(String str) {
        p.j(str, "uriPattern");
        addDeepLink(new NavDeepLink.Builder().setUriPattern(str).build());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final int[] buildDeepLinkIds() {
        return buildDeepLinkIds$default(this, null, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0081  */
    /* JADX WARN: Code duplicated, block: B:60:0x0122  */
    public boolean equals(Object other) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        if (other == null || !(other instanceof NavDestination)) {
            return false;
        }
        NavDestination navDestination = (NavDestination) other;
        boolean z16 = b0.l0(this.deepLinks, navDestination.deepLinks).size() == this.deepLinks.size();
        if (this.actions.size() == navDestination.actions.size()) {
            Iterator it = r.g(SparseArrayKt.valueIterator(this.actions)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    z14 = true;
                    break;
                }
                if (!navDestination.actions.containsValue((NavAction) it.next())) {
                    z14 = false;
                    break;
                }
            }
            if (z14) {
                Iterator it2 = r.g(SparseArrayKt.valueIterator(navDestination.actions)).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z15 = true;
                        break;
                    }
                    if (!this.actions.containsValue((NavAction) it2.next())) {
                        z15 = false;
                        break;
                    }
                }
                if (z15) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        if (getArguments().size() == navDestination.getArguments().size()) {
            Iterator it3 = n0.C(getArguments()).iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z12 = true;
                    break;
                }
                Map.Entry entry = (Map.Entry) it3.next();
                if (!(navDestination.getArguments().containsKey(entry.getKey()) && p.e(navDestination.getArguments().get(entry.getKey()), entry.getValue()))) {
                    z12 = false;
                    break;
                }
            }
            if (z12) {
                Iterator it4 = n0.C(navDestination.getArguments()).iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        z13 = true;
                        break;
                    }
                    Map.Entry entry2 = (Map.Entry) it4.next();
                    if (!(getArguments().containsKey(entry2.getKey()) && p.e(getArguments().get(entry2.getKey()), entry2.getValue()))) {
                        z13 = false;
                        break;
                    }
                }
                if (z13) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        return this.id == navDestination.id && p.e(this.route, navDestination.route) && z16 && z10 && z11;
    }

    public boolean hasDeepLink(Uri deepLink) {
        p.j(deepLink, "deepLink");
        return hasDeepLink(new NavDeepLinkRequest(deepLink, null, null));
    }

    public final void putAction(@IdRes int i10, @IdRes int i11) {
        putAction(i10, new NavAction(i11, null, null, 6, null));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean supportsActions() {
        return true;
    }

    public static /* synthetic */ int[] buildDeepLinkIds$default(NavDestination navDestination, NavDestination navDestination2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildDeepLinkIds");
        }
        if ((i10 & 1) != 0) {
            navDestination2 = null;
        }
        return navDestination.buildDeepLinkIds(navDestination2);
    }

    public final void addArgument(String str, NavArgument navArgument) {
        p.j(str, "argumentName");
        p.j(navArgument, "argument");
        this._arguments.put(str, navArgument);
    }

    public final void addDeepLink(NavDeepLink navDeepLink) {
        p.j(navDeepLink, "navDeepLink");
        Map<String, NavArgument> arguments = getArguments();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, NavArgument>> it = arguments.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, NavArgument> next = it.next();
            NavArgument value = next.getValue();
            if ((value.getIsNullable() || value.getIsDefaultValuePresent()) ? false : true) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (!navDeepLink.getArgumentsNames$navigation_common_release().contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            this.deepLinks.add(navDeepLink);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + navDeepLink.getUriPattern() + " can't be used to open destination " + this + ".\nFollowing required arguments are missing: " + arrayList).toString());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Bundle addInDefaultArgs(Bundle args) {
        if (args == null) {
            Map<String, NavArgument> map = this._arguments;
            if (map == null || map.isEmpty()) {
                return null;
            }
        }
        Bundle bundle = new Bundle();
        for (Map.Entry<String, NavArgument> entry : this._arguments.entrySet()) {
            entry.getValue().putDefaultValue(entry.getKey(), bundle);
        }
        if (args != null) {
            bundle.putAll(args);
            for (Map.Entry<String, NavArgument> entry2 : this._arguments.entrySet()) {
                String key = entry2.getKey();
                NavArgument value = entry2.getValue();
                if (!value.verify(key, bundle)) {
                    throw new IllegalArgumentException(("Wrong argument type for '" + key + "' in argument bundle. " + value.getType().getName() + " expected.").toString());
                }
            }
        }
        return bundle;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    /* JADX WARN: Code duplicated, block: B:14:0x002e  */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final int[] buildDeepLinkIds(NavDestination previousDestination) {
        nj.i iVar = new nj.i();
        NavDestination navDestination = this;
        while (true) {
            p.g(navDestination);
            NavGraph navGraph = navDestination.parent;
            if ((previousDestination != null ? previousDestination.parent : null) != null) {
                NavGraph navGraph2 = previousDestination.parent;
                p.g(navGraph2);
                if (navGraph2.findNode(navDestination.id) != navDestination) {
                    if (navGraph != null || navGraph.getStartDestId() != navDestination.id) {
                        iVar.addFirst(navDestination);
                    }
                    if (!p.e(navGraph, previousDestination) || navGraph == null) {
                        break;
                    }
                    navDestination = navGraph;
                } else {
                    iVar.addFirst(navDestination);
                    break;
                }
            } else {
                if (navGraph != null) {
                    iVar.addFirst(navDestination);
                } else {
                    iVar.addFirst(navDestination);
                }
                if (!p.e(navGraph, previousDestination)) {
                    break;
                }
                navDestination = navGraph;
            }
        }
        List listO0 = b0.O0(iVar);
        ArrayList arrayList = new ArrayList(t.v(listO0, 10));
        Iterator it = listO0.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((NavDestination) it.next()).id));
        }
        return b0.N0(arrayList);
    }

    public final NavAction getAction(@IdRes int id2) {
        NavAction navAction = this.actions.isEmpty() ? null : this.actions.get(id2);
        if (navAction != null) {
            return navAction;
        }
        NavGraph navGraph = this.parent;
        if (navGraph != null) {
            return navGraph.getAction(id2);
        }
        return null;
    }

    public final Map<String, NavArgument> getArguments() {
        return kotlin.collections.a.x(this._arguments);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public String getDisplayName() {
        String str = this.idName;
        return str == null ? String.valueOf(this.id) : str;
    }

    @IdRes
    public final int getId() {
        return this.id;
    }

    public final CharSequence getLabel() {
        return this.label;
    }

    public final String getNavigatorName() {
        return this.navigatorName;
    }

    public final NavGraph getParent() {
        return this.parent;
    }

    public final String getRoute() {
        return this.route;
    }

    public boolean hasDeepLink(NavDeepLinkRequest deepLinkRequest) {
        p.j(deepLinkRequest, "deepLinkRequest");
        return matchDeepLink(deepLinkRequest) != null;
    }

    public int hashCode() {
        Set<String> setKeySet;
        int i10 = this.id * 31;
        String str = this.route;
        int iHashCode = i10 + (str != null ? str.hashCode() : 0);
        for (NavDeepLink navDeepLink : this.deepLinks) {
            int i11 = iHashCode * 31;
            String uriPattern = navDeepLink.getUriPattern();
            int iHashCode2 = (i11 + (uriPattern != null ? uriPattern.hashCode() : 0)) * 31;
            String action = navDeepLink.getAction();
            int iHashCode3 = (iHashCode2 + (action != null ? action.hashCode() : 0)) * 31;
            String mimeType = navDeepLink.getMimeType();
            iHashCode = iHashCode3 + (mimeType != null ? mimeType.hashCode() : 0);
        }
        Iterator itValueIterator = SparseArrayKt.valueIterator(this.actions);
        while (itValueIterator.hasNext()) {
            NavAction navAction = (NavAction) itValueIterator.next();
            int destinationId = ((iHashCode * 31) + navAction.getDestinationId()) * 31;
            NavOptions navOptions = navAction.getNavOptions();
            iHashCode = destinationId + (navOptions != null ? navOptions.hashCode() : 0);
            Bundle defaultArguments = navAction.getDefaultArguments();
            if (defaultArguments != null && (setKeySet = defaultArguments.keySet()) != null) {
                p.i(setKeySet, "keySet()");
                for (String str2 : setKeySet) {
                    int i12 = iHashCode * 31;
                    Bundle defaultArguments2 = navAction.getDefaultArguments();
                    p.g(defaultArguments2);
                    Object obj = defaultArguments2.get(str2);
                    iHashCode = i12 + (obj != null ? obj.hashCode() : 0);
                }
            }
        }
        for (String str3 : getArguments().keySet()) {
            int iHashCode4 = ((iHashCode * 31) + str3.hashCode()) * 31;
            NavArgument navArgument = getArguments().get(str3);
            iHashCode = iHashCode4 + (navArgument != null ? navArgument.hashCode() : 0);
        }
        return iHashCode;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public DeepLinkMatch matchDeepLink(NavDeepLinkRequest navDeepLinkRequest) {
        p.j(navDeepLinkRequest, "navDeepLinkRequest");
        if (this.deepLinks.isEmpty()) {
            return null;
        }
        DeepLinkMatch deepLinkMatch = null;
        for (NavDeepLink navDeepLink : this.deepLinks) {
            Uri uri = navDeepLinkRequest.getUri();
            Bundle matchingArguments = uri != null ? navDeepLink.getMatchingArguments(uri, getArguments()) : null;
            String action = navDeepLinkRequest.getAction();
            boolean z10 = action != null && p.e(action, navDeepLink.getAction());
            String mimeType = navDeepLinkRequest.getMimeType();
            int mimeTypeMatchRating = mimeType != null ? navDeepLink.getMimeTypeMatchRating(mimeType) : -1;
            if (matchingArguments != null || z10 || mimeTypeMatchRating > -1) {
                DeepLinkMatch deepLinkMatch2 = new DeepLinkMatch(this, matchingArguments, navDeepLink.getIsExactDeepLink(), z10, mimeTypeMatchRating);
                if (deepLinkMatch == null || deepLinkMatch2.compareTo(deepLinkMatch) > 0) {
                    deepLinkMatch = deepLinkMatch2;
                }
            }
        }
        return deepLinkMatch;
    }

    @CallSuper
    public void onInflate(Context context, AttributeSet attributeSet) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(attributeSet, "attrs");
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, androidx.navigation.common.R.styleable.Navigator);
        p.i(typedArrayObtainAttributes, "context.resources.obtain…s, R.styleable.Navigator)");
        setRoute(typedArrayObtainAttributes.getString(androidx.navigation.common.R.styleable.Navigator_route));
        int i10 = androidx.navigation.common.R.styleable.Navigator_android_id;
        if (typedArrayObtainAttributes.hasValue(i10)) {
            setId(typedArrayObtainAttributes.getResourceId(i10, 0));
            this.idName = INSTANCE.getDisplayName(context, this.id);
        }
        this.label = typedArrayObtainAttributes.getText(androidx.navigation.common.R.styleable.Navigator_android_label);
        mj.r rVar = mj.r.f64562a;
        typedArrayObtainAttributes.recycle();
    }

    public final void putAction(@IdRes int i10, NavAction navAction) {
        p.j(navAction, "action");
        if (supportsActions()) {
            if (!(i10 != 0)) {
                throw new IllegalArgumentException("Cannot have an action with actionId 0".toString());
            }
            this.actions.put(i10, navAction);
        } else {
            throw new UnsupportedOperationException("Cannot add action " + i10 + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
        }
    }

    public final void removeAction(@IdRes int i10) {
        this.actions.remove(i10);
    }

    public final void removeArgument(String str) {
        p.j(str, "argumentName");
        this._arguments.remove(str);
    }

    public final void setId(@IdRes int i10) {
        this.id = i10;
        this.idName = null;
    }

    public final void setLabel(CharSequence charSequence) {
        this.label = charSequence;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setParent(NavGraph navGraph) {
        this.parent = navGraph;
    }

    public final void setRoute(String str) {
        if (str == null) {
            setId(0);
        } else {
            if (!(!a0.n0(str))) {
                throw new IllegalArgumentException("Cannot have an empty route".toString());
            }
            String strCreateRoute = INSTANCE.createRoute(str);
            setId(strCreateRoute.hashCode());
            addDeepLink(strCreateRoute);
        }
        List<NavDeepLink> list = this.deepLinks;
        for (Object obj : list) {
            if (p.e(((NavDeepLink) obj).getUriPattern(), INSTANCE.createRoute(this.route))) {
                x.a(list).remove(obj);
                this.route = str;
            }
        }
        obj = null;
        x.a(list).remove(obj);
        this.route = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("(");
        String str = this.idName;
        if (str == null) {
            sb2.append("0x");
            sb2.append(Integer.toHexString(this.id));
        } else {
            sb2.append(str);
        }
        sb2.append(")");
        String str2 = this.route;
        if (!(str2 == null || a0.n0(str2))) {
            sb2.append(" route=");
            sb2.append(this.route);
        }
        if (this.label != null) {
            sb2.append(" label=");
            sb2.append(this.label);
        }
        String string = sb2.toString();
        p.i(string, "sb.toString()");
        return string;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavDestination(Navigator<? extends NavDestination> navigator) {
        this(NavigatorProvider.INSTANCE.getNameForNavigator$navigation_common_release(navigator.getClass()));
        p.j(navigator, "navigator");
    }
}
