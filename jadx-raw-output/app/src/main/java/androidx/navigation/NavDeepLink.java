package androidx.navigation;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationCompat;
import ck.i;
import ck.p;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBuilderBridgeCommon;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.text.Regex;
import lk.a0;
import lk.x;
import me.goldze.mvvmhabit.base.ContainerActivity;
import mj.g;
import nj.b0;
import nj.s;

/* JADX INFO: compiled from: NavDeepLink.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0010!\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010 \n\u0002\b\u000b\u0018\u0000 L2\u00020\u0001:\u0004MLNOB'\b\u0000\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bI\u0010JB\u0011\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\bI\u0010KJ$\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0012\u0010\f\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000bH\u0002J\u0012\u0010\u000e\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\u0010\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0002J*\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001bH\u0000¢\u0006\u0004\b\u0018\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0007J(\u0010#\u001a\u0004\u0018\u00010\u00112\u0006\u0010 \u001a\u00020\u000b2\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00150!H\u0007J\u0013\u0010%\u001a\u00020\t2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010&\u001a\u00020\u001eH\u0016R\u0019\u0010'\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b+\u0010*R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010(\u001a\u0004\b,\u0010*R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010.R \u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002000/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00103\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010(R\u001d\u00108\u001a\u0004\u0018\u00010\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0016\u00109\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010:R\u0018\u0010<\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010(R\u001d\u0010?\u001a\u0004\u0018\u00010\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u00105\u001a\u0004\b>\u00107R*\u0010A\u001a\u00020\t2\u0006\u0010@\u001a\u00020\t8G@@X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010:\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00020E8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bF\u0010G¨\u0006P"}, d2 = {"Landroidx/navigation/NavDeepLink;", "", "", NotificationCompat.MessagingStyle.Message.KEY_DATA_URI, "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "uriRegex", "Ljava/util/regex/Pattern;", "fillInPattern", "", "buildPathRegex", "Landroid/net/Uri;", "matchUri", "action", "matchAction", "mimeType", "matchMimeType", "Landroid/os/Bundle;", ContainerActivity.BUNDLE, "name", "value", "Landroidx/navigation/NavArgument;", "argument", "parseArgument", "matches$navigation_common_release", "(Landroid/net/Uri;)Z", "matches", "Landroidx/navigation/NavDeepLinkRequest;", "deepLinkRequest", "(Landroidx/navigation/NavDeepLinkRequest;)Z", "", "getMimeTypeMatchRating", "deepLink", "", "arguments", "getMatchingArguments", "other", "equals", "hashCode", "uriPattern", "Ljava/lang/String;", "getUriPattern", "()Ljava/lang/String;", "getAction", "getMimeType", "", "Ljava/util/List;", "", "Landroidx/navigation/NavDeepLink$ParamQuery;", "paramArgMap", "Ljava/util/Map;", "patternFinalRegex", "pattern$delegate", "Lmj/g;", "getPattern", "()Ljava/util/regex/Pattern;", "pattern", "isParameterizedQuery", "Z", "isSingleQueryParamValueOnly", "mimeTypeFinalRegex", "mimeTypePattern$delegate", "getMimeTypePattern", "mimeTypePattern", "<set-?>", "isExactDeepLink", "()Z", "setExactDeepLink$navigation_common_release", "(Z)V", "", "getArgumentsNames$navigation_common_release", "()Ljava/util/List;", "argumentsNames", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/String;)V", VastTagName.COMPANION, "Builder", "MimeType", "ParamQuery", "navigation-common_release"}, k = 1, mv = {1, 6, 0})
public final class NavDeepLink {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final Pattern SCHEME_PATTERN = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");
    private final String action;
    private final List<String> arguments;
    private boolean isExactDeepLink;
    private boolean isParameterizedQuery;
    private boolean isSingleQueryParamValueOnly;
    private final String mimeType;
    private String mimeTypeFinalRegex;

    /* JADX INFO: renamed from: mimeTypePattern$delegate, reason: from kotlin metadata */
    private final g mimeTypePattern;
    private final Map<String, ParamQuery> paramArgMap;

    /* JADX INFO: renamed from: pattern$delegate, reason: from kotlin metadata */
    private final g pattern;
    private String patternFinalRegex;
    private final String uriPattern;

    /* JADX INFO: compiled from: NavDeepLink.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007\b\u0017¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/navigation/NavDeepLink$Builder;", "", "()V", "action", "", "mimeType", "uriPattern", BillingClientBuilderBridgeCommon.buildMethodName, "Landroidx/navigation/NavDeepLink;", "setAction", "setMimeType", "setUriPattern", VastTagName.COMPANION, "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Builder {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private String action;
        private String mimeType;
        private String uriPattern;

        /* JADX INFO: compiled from: NavDeepLink.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006H\u0007¨\u0006\u000b"}, d2 = {"Landroidx/navigation/NavDeepLink$Builder$Companion;", "", "()V", "fromAction", "Landroidx/navigation/NavDeepLink$Builder;", "action", "", "fromMimeType", "mimeType", "fromUriPattern", "uriPattern", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final Builder fromAction(String action) {
                p.j(action, "action");
                if (!(action.length() > 0)) {
                    throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.".toString());
                }
                Builder builder = new Builder();
                builder.setAction(action);
                return builder;
            }

            public final Builder fromMimeType(String mimeType) {
                p.j(mimeType, "mimeType");
                Builder builder = new Builder();
                builder.setMimeType(mimeType);
                return builder;
            }

            public final Builder fromUriPattern(String uriPattern) {
                p.j(uriPattern, "uriPattern");
                Builder builder = new Builder();
                builder.setUriPattern(uriPattern);
                return builder;
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder() {
        }

        public static final Builder fromAction(String str) {
            return INSTANCE.fromAction(str);
        }

        public static final Builder fromMimeType(String str) {
            return INSTANCE.fromMimeType(str);
        }

        public static final Builder fromUriPattern(String str) {
            return INSTANCE.fromUriPattern(str);
        }

        public final NavDeepLink build() {
            return new NavDeepLink(this.uriPattern, this.action, this.mimeType);
        }

        public final Builder setAction(String action) {
            p.j(action, "action");
            if (!(action.length() > 0)) {
                throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.".toString());
            }
            this.action = action;
            return this;
        }

        public final Builder setMimeType(String mimeType) {
            p.j(mimeType, "mimeType");
            this.mimeType = mimeType;
            return this;
        }

        public final Builder setUriPattern(String uriPattern) {
            p.j(uriPattern, "uriPattern");
            this.uriPattern = uriPattern;
            return this;
        }
    }

    /* JADX INFO: compiled from: NavDeepLink.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Landroidx/navigation/NavDeepLink$Companion;", "", "()V", "SCHEME_PATTERN", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: NavDeepLink.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0000H\u0096\u0002R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0004R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\u0004¨\u0006\u000f"}, d2 = {"Landroidx/navigation/NavDeepLink$MimeType;", "", "mimeType", "", "(Ljava/lang/String;)V", "subType", "getSubType", "()Ljava/lang/String;", "setSubType", "type", "getType", "setType", "compareTo", "", "other", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class MimeType implements Comparable<MimeType> {
        private String subType;
        private String type;

        public MimeType(String str) {
            List listK;
            p.j(str, "mimeType");
            List<String> listSplit = new Regex("/").split(str, 0);
            if (listSplit.isEmpty()) {
                listK = s.k();
            } else {
                ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
                while (listIterator.hasPrevious()) {
                    if (!(listIterator.previous().length() == 0)) {
                        listK = b0.I0(listSplit, listIterator.nextIndex() + 1);
                    }
                }
                listK = s.k();
            }
            this.type = (String) listK.get(0);
            this.subType = (String) listK.get(1);
        }

        @Override // java.lang.Comparable
        public int compareTo(MimeType other) {
            p.j(other, "other");
            int i10 = p.e(this.type, other.type) ? 2 : 0;
            return p.e(this.subType, other.subType) ? i10 + 1 : i10;
        }

        public final String getSubType() {
            return this.subType;
        }

        public final String getType() {
            return this.type;
        }

        public final void setSubType(String str) {
            p.j(str, "<set-?>");
            this.subType = str;
        }

        public final void setType(String str) {
            p.j(str, "<set-?>");
            this.type = str;
        }
    }

    /* JADX INFO: compiled from: NavDeepLink.kt */
    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0006R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Landroidx/navigation/NavDeepLink$ParamQuery;", "", "", "name", "Lmj/r;", "addArgumentName", "", "index", "getArgumentName", "size", "paramRegex", "Ljava/lang/String;", "getParamRegex", "()Ljava/lang/String;", "setParamRegex", "(Ljava/lang/String;)V", "", "arguments", "Ljava/util/List;", "getArguments", "()Ljava/util/List;", "<init>", "()V", "navigation-common_release"}, k = 1, mv = {1, 6, 0})
    public static final class ParamQuery {
        private final List<String> arguments = new ArrayList();
        private String paramRegex;

        public final void addArgumentName(String str) {
            p.j(str, "name");
            this.arguments.add(str);
        }

        public final String getArgumentName(int index) {
            return this.arguments.get(index);
        }

        public final List<String> getArguments() {
            return this.arguments;
        }

        public final String getParamRegex() {
            return this.paramRegex;
        }

        public final void setParamRegex(String str) {
            this.paramRegex = str;
        }

        public final int size() {
            return this.arguments.size();
        }
    }

    public NavDeepLink(String str, String str2, String str3) {
        this.uriPattern = str;
        this.action = str2;
        this.mimeType = str3;
        this.arguments = new ArrayList();
        this.paramArgMap = new LinkedHashMap();
        this.pattern = kotlin.b.a(new bk.a<Pattern>() { // from class: androidx.navigation.NavDeepLink$pattern$2
            {
                super(0);
            }

            @Override // bk.a
            public final Pattern invoke() {
                String str4 = this.this$0.patternFinalRegex;
                if (str4 != null) {
                    return Pattern.compile(str4, 2);
                }
                return null;
            }
        });
        this.mimeTypePattern = kotlin.b.a(new bk.a<Pattern>() { // from class: androidx.navigation.NavDeepLink$mimeTypePattern$2
            {
                super(0);
            }

            @Override // bk.a
            public final Pattern invoke() {
                String str4 = this.this$0.mimeTypeFinalRegex;
                if (str4 != null) {
                    return Pattern.compile(str4);
                }
                return null;
            }
        });
        if (str != null) {
            Uri uri = Uri.parse(str);
            this.isParameterizedQuery = uri.getQuery() != null;
            StringBuilder sb2 = new StringBuilder("^");
            if (!SCHEME_PATTERN.matcher(str).find()) {
                sb2.append("http[s]?://");
            }
            Pattern patternCompile = Pattern.compile("\\{(.+?)\\}");
            if (this.isParameterizedQuery) {
                Matcher matcher = Pattern.compile("(\\?)").matcher(str);
                if (matcher.find()) {
                    String strSubstring = str.substring(0, matcher.start());
                    p.i(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    p.i(patternCompile, "fillInPattern");
                    this.isExactDeepLink = buildPathRegex(strSubstring, sb2, patternCompile);
                }
                for (String str4 : uri.getQueryParameterNames()) {
                    StringBuilder sb3 = new StringBuilder();
                    String queryParameter = uri.getQueryParameter(str4);
                    if (queryParameter == null) {
                        this.isSingleQueryParamValueOnly = true;
                        queryParameter = str4;
                    }
                    Matcher matcher2 = patternCompile.matcher(queryParameter);
                    ParamQuery paramQuery = new ParamQuery();
                    int iEnd = 0;
                    while (matcher2.find()) {
                        String strGroup = matcher2.group(1);
                        if (strGroup == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        paramQuery.addArgumentName(strGroup);
                        p.i(queryParameter, "queryParam");
                        String strSubstring2 = queryParameter.substring(iEnd, matcher2.start());
                        p.i(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb3.append(Pattern.quote(strSubstring2));
                        sb3.append("(.+?)?");
                        iEnd = matcher2.end();
                    }
                    if (iEnd < queryParameter.length()) {
                        p.i(queryParameter, "queryParam");
                        String strSubstring3 = queryParameter.substring(iEnd);
                        p.i(strSubstring3, "this as java.lang.String).substring(startIndex)");
                        sb3.append(Pattern.quote(strSubstring3));
                    }
                    String string = sb3.toString();
                    p.i(string, "argRegex.toString()");
                    paramQuery.setParamRegex(x.N(string, ".*", "\\E.*\\Q", false, 4, null));
                    Map<String, ParamQuery> map = this.paramArgMap;
                    p.i(str4, "paramName");
                    map.put(str4, paramQuery);
                }
            } else {
                p.i(patternCompile, "fillInPattern");
                this.isExactDeepLink = buildPathRegex(str, sb2, patternCompile);
            }
            String string2 = sb2.toString();
            p.i(string2, "uriRegex.toString()");
            this.patternFinalRegex = x.N(string2, ".*", "\\E.*\\Q", false, 4, null);
        }
        if (this.mimeType != null) {
            if (!Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(this.mimeType).matches()) {
                throw new IllegalArgumentException(("The given mimeType " + this.mimeType + " does not match to required \"type/subtype\" format").toString());
            }
            MimeType mimeType = new MimeType(this.mimeType);
            this.mimeTypeFinalRegex = x.N("^(" + mimeType.getType() + "|[*]+)/(" + mimeType.getSubType() + "|[*]+)$", "*|[*]", "[\\s\\S]", false, 4, null);
        }
    }

    private final boolean matchAction(String action) {
        boolean z10 = action == null;
        String str = this.action;
        return z10 != (str != null) && (action == null || p.e(str, action));
    }

    private final boolean matchMimeType(String mimeType) {
        if ((mimeType == null) != (this.mimeType != null)) {
            if (mimeType == null) {
                return true;
            }
            Pattern mimeTypePattern = getMimeTypePattern();
            p.g(mimeTypePattern);
            if (mimeTypePattern.matcher(mimeType).matches()) {
                return true;
            }
        }
        return false;
    }

    private final boolean matchUri(Uri uri) {
        if ((uri == null) != (getPattern() != null)) {
            if (uri == null) {
                return true;
            }
            Pattern pattern = getPattern();
            p.g(pattern);
            if (pattern.matcher(uri.toString()).matches()) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof NavDeepLink)) {
            return false;
        }
        NavDeepLink navDeepLink = (NavDeepLink) other;
        return p.e(this.uriPattern, navDeepLink.uriPattern) && p.e(this.action, navDeepLink.action) && p.e(this.mimeType, navDeepLink.mimeType);
    }

    public final boolean matches$navigation_common_release(Uri uri) {
        p.j(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        return matches$navigation_common_release(new NavDeepLinkRequest(uri, null, null));
    }

    private final Pattern getMimeTypePattern() {
        return (Pattern) this.mimeTypePattern.getValue();
    }

    private final Pattern getPattern() {
        return (Pattern) this.pattern.getValue();
    }

    private final boolean parseArgument(Bundle bundle, String name, String value, NavArgument argument) {
        if (argument != null) {
            argument.getType().parseAndPut(bundle, name, value);
            return false;
        }
        bundle.putString(name, value);
        return false;
    }

    public final String getAction() {
        return this.action;
    }

    public final List<String> getArgumentsNames$navigation_common_release() {
        List<String> list = this.arguments;
        Collection<ParamQuery> collectionValues = this.paramArgMap.values();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            nj.x.C(arrayList, ((ParamQuery) it.next()).getArguments());
        }
        return b0.y0(list, arrayList);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Bundle getMatchingArguments(Uri deepLink, Map<String, NavArgument> arguments) {
        Matcher matcher;
        String strGroup;
        p.j(deepLink, "deepLink");
        p.j(arguments, "arguments");
        Pattern pattern = getPattern();
        Matcher matcher2 = pattern != null ? pattern.matcher(deepLink.toString()) : null;
        if (matcher2 == null || !matcher2.matches()) {
            return null;
        }
        Bundle bundle = new Bundle();
        int size = this.arguments.size();
        int i10 = 0;
        while (i10 < size) {
            String str = this.arguments.get(i10);
            i10++;
            String strDecode = Uri.decode(matcher2.group(i10));
            NavArgument navArgument = arguments.get(str);
            try {
                p.i(strDecode, "value");
                if (parseArgument(bundle, str, strDecode, navArgument)) {
                    return null;
                }
            } catch (IllegalArgumentException unused) {
            }
        }
        if (this.isParameterizedQuery) {
            for (String str2 : this.paramArgMap.keySet()) {
                ParamQuery paramQuery = this.paramArgMap.get(str2);
                String queryParameter = deepLink.getQueryParameter(str2);
                if (this.isSingleQueryParamValueOnly) {
                    String string = deepLink.toString();
                    p.i(string, "deepLink.toString()");
                    String strV0 = a0.V0(string, '?', null, 2, null);
                    if (!p.e(strV0, string)) {
                        queryParameter = strV0;
                    }
                }
                if (queryParameter != null) {
                    p.g(paramQuery);
                    matcher = Pattern.compile(paramQuery.getParamRegex(), 32).matcher(queryParameter);
                    if (!matcher.matches()) {
                        return null;
                    }
                } else {
                    matcher = null;
                }
                Bundle bundle2 = new Bundle();
                try {
                    p.g(paramQuery);
                    int size2 = paramQuery.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        if (matcher != null) {
                            strGroup = matcher.group(i11 + 1);
                            if (strGroup == null) {
                                strGroup = "";
                            }
                        } else {
                            strGroup = null;
                        }
                        String argumentName = paramQuery.getArgumentName(i11);
                        NavArgument navArgument2 = arguments.get(argumentName);
                        if (strGroup != null) {
                            if (!p.e(strGroup, '{' + argumentName + '}') && parseArgument(bundle2, argumentName, strGroup, navArgument2)) {
                                return null;
                            }
                        }
                    }
                    bundle.putAll(bundle2);
                } catch (IllegalArgumentException unused2) {
                }
            }
        }
        for (Map.Entry<String, NavArgument> entry : arguments.entrySet()) {
            String key = entry.getKey();
            NavArgument value = entry.getValue();
            if (((value == null || value.getIsNullable() || value.getIsDefaultValuePresent()) ? false : true) && !bundle.containsKey(key)) {
                return null;
            }
        }
        return bundle;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final int getMimeTypeMatchRating(String mimeType) {
        p.j(mimeType, "mimeType");
        if (this.mimeType != null) {
            Pattern mimeTypePattern = getMimeTypePattern();
            p.g(mimeTypePattern);
            if (mimeTypePattern.matcher(mimeType).matches()) {
                return new MimeType(this.mimeType).compareTo(new MimeType(mimeType));
            }
        }
        return -1;
    }

    public final String getUriPattern() {
        return this.uriPattern;
    }

    public int hashCode() {
        String str = this.uriPattern;
        int iHashCode = ((str != null ? str.hashCode() : 0) + 0) * 31;
        String str2 = this.action;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.mimeType;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: isExactDeepLink, reason: from getter */
    public final boolean getIsExactDeepLink() {
        return this.isExactDeepLink;
    }

    public final boolean matches$navigation_common_release(NavDeepLinkRequest deepLinkRequest) {
        p.j(deepLinkRequest, "deepLinkRequest");
        if (matchUri(deepLinkRequest.getUri()) && matchAction(deepLinkRequest.getAction())) {
            return matchMimeType(deepLinkRequest.getMimeType());
        }
        return false;
    }

    public final void setExactDeepLink$navigation_common_release(boolean z10) {
        this.isExactDeepLink = z10;
    }

    private final boolean buildPathRegex(String uri, StringBuilder uriRegex, Pattern fillInPattern) {
        Matcher matcher = fillInPattern.matcher(uri);
        boolean z10 = !a0.X(uri, ".*", false, 2, null);
        int iEnd = 0;
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (strGroup != null) {
                this.arguments.add(strGroup);
                String strSubstring = uri.substring(iEnd, matcher.start());
                p.i(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                uriRegex.append(Pattern.quote(strSubstring));
                uriRegex.append("([^/]+?)");
                iEnd = matcher.end();
                z10 = false;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        }
        if (iEnd < uri.length()) {
            String strSubstring2 = uri.substring(iEnd);
            p.i(strSubstring2, "this as java.lang.String).substring(startIndex)");
            uriRegex.append(Pattern.quote(strSubstring2));
        }
        uriRegex.append("($|(\\?(.)*)|(\\#(.)*))");
        return z10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public NavDeepLink(String str) {
        this(str, null, null);
        p.j(str, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
    }
}
