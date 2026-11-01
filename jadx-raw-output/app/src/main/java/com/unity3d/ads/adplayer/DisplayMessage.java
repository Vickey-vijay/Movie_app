package com.unity3d.ads.adplayer;

import android.content.Intent;
import android.webkit.WebView;
import ck.i;
import ck.p;
import java.util.Map;

/* JADX INFO: compiled from: DisplayMessage.kt */
/* JADX INFO: loaded from: classes4.dex */
public abstract class DisplayMessage {
    private final String opportunityId;

    /* JADX INFO: compiled from: DisplayMessage.kt */
    public static final class DisplayDestroyed extends DisplayMessage {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DisplayDestroyed(String str) {
            super(str, null);
            p.j(str, "opportunityId");
        }
    }

    /* JADX INFO: compiled from: DisplayMessage.kt */
    public static final class DisplayError extends DisplayMessage {
        private final String reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DisplayError(String str, String str2) {
            super(str, null);
            p.j(str, "opportunityId");
            p.j(str2, "reason");
            this.reason = str2;
        }

        public final String getReason() {
            return this.reason;
        }
    }

    /* JADX INFO: compiled from: DisplayMessage.kt */
    public static final class DisplayFinishRequest extends DisplayMessage {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DisplayFinishRequest(String str) {
            super(str, null);
            p.j(str, "opportunityId");
        }
    }

    /* JADX INFO: compiled from: DisplayMessage.kt */
    public static final class DisplayReady extends DisplayMessage {
        private final Map<String, Object> showOptions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DisplayReady(String str, Map<String, ? extends Object> map) {
            super(str, null);
            p.j(str, "opportunityId");
            this.showOptions = map;
        }

        public /* synthetic */ DisplayReady(String str, Map map, int i10, i iVar) {
            this(str, (i10 & 2) != 0 ? null : map);
        }

        public final Map<String, Object> getShowOptions() {
            return this.showOptions;
        }
    }

    /* JADX INFO: compiled from: DisplayMessage.kt */
    public static final class FocusChanged extends DisplayMessage {
        private final boolean isFocused;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FocusChanged(String str, boolean z10) {
            super(str, null);
            p.j(str, "opportunityId");
            this.isFocused = z10;
        }

        public final boolean isFocused() {
            return this.isFocused;
        }
    }

    /* JADX INFO: compiled from: DisplayMessage.kt */
    public static final class OpenUrl extends DisplayMessage {
        private final Intent intent;
        private final boolean useActivityForResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenUrl(String str, Intent intent, boolean z10) {
            super(str, null);
            p.j(str, "opportunityId");
            p.j(intent, "intent");
            this.intent = intent;
            this.useActivityForResult = z10;
        }

        public final Intent getIntent() {
            return this.intent;
        }

        public final boolean getUseActivityForResult() {
            return this.useActivityForResult;
        }
    }

    /* JADX INFO: compiled from: DisplayMessage.kt */
    public static final class OpenUrlResult extends DisplayMessage {
        private final boolean success;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenUrlResult(String str, boolean z10) {
            super(str, null);
            p.j(str, "opportunityId");
            this.success = z10;
        }

        public final boolean getSuccess() {
            return this.success;
        }
    }

    /* JADX INFO: compiled from: DisplayMessage.kt */
    public static final class SetOrientation extends DisplayMessage {
        private final int orientation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetOrientation(String str, int i10) {
            super(str, null);
            p.j(str, "opportunityId");
            this.orientation = i10;
        }

        public final int getOrientation() {
            return this.orientation;
        }
    }

    /* JADX INFO: compiled from: DisplayMessage.kt */
    public static final class VisibilityChanged extends DisplayMessage {
        private final boolean isVisible;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VisibilityChanged(String str, boolean z10) {
            super(str, null);
            p.j(str, "opportunityId");
            this.isVisible = z10;
        }

        public final boolean isVisible() {
            return this.isVisible;
        }
    }

    /* JADX INFO: compiled from: DisplayMessage.kt */
    public static final class WebViewInstanceRequest extends DisplayMessage {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WebViewInstanceRequest(String str) {
            super(str, null);
            p.j(str, "opportunityId");
        }
    }

    /* JADX INFO: compiled from: DisplayMessage.kt */
    public static final class WebViewInstanceResponse extends DisplayMessage {
        private final WebView webView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WebViewInstanceResponse(String str, WebView webView) {
            super(str, null);
            p.j(str, "opportunityId");
            p.j(webView, "webView");
            this.webView = webView;
        }

        public final WebView getWebView() {
            return this.webView;
        }
    }

    private DisplayMessage(String str) {
        this.opportunityId = str;
    }

    public /* synthetic */ DisplayMessage(String str, i iVar) {
        this(str);
    }

    public final String getOpportunityId() {
        return this.opportunityId;
    }
}
