package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import ck.i;
import ck.p;
import com.facebook.internal.k0;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.io.IOException;
import java.security.spec.InvalidKeySpecException;
import java.util.List;
import kotlin.Metadata;
import lk.a0;
import m2.c;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: AuthenticationToken.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 32\u00020\u0001:\u0001\u0017B\u0019\b\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u0011\u0012\u0006\u0010\u001d\u001a\u00020\u0011¢\u0006\u0004\b-\u0010.B\u0011\b\u0010\u0012\u0006\u0010/\u001a\u00020\u000b¢\u0006\u0004\b-\u00100B\u0011\b\u0010\u0012\u0006\u00101\u001a\u00020\u0002¢\u0006\u0004\b-\u00102J\u000f\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002J\b\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\tH\u0016J\b\u0010\u0010\u001a\u00020\tH\u0016J(\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011H\u0002R\u0017\u0010\u001b\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001d\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010#\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010)\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010,\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b*\u0010\u0018\u001a\u0004\b+\u0010\u001a¨\u00064"}, d2 = {"Lcom/facebook/AuthenticationToken;", "Landroid/os/Parcelable;", "Lorg/json/JSONObject;", "c", "()Lorg/json/JSONObject;", "", "other", "", "equals", "", "hashCode", "Landroid/os/Parcel;", "dest", "flags", "Lmj/r;", "writeToParcel", "describeContents", "", "headerString", "claimsString", "sigString", "kid", "a", "b", "Ljava/lang/String;", "getToken", "()Ljava/lang/String;", "token", "getExpectedNonce", "expectedNonce", "Lcom/facebook/AuthenticationTokenHeader;", "d", "Lcom/facebook/AuthenticationTokenHeader;", "getHeader", "()Lcom/facebook/AuthenticationTokenHeader;", "header", "Lcom/facebook/AuthenticationTokenClaims;", "e", "Lcom/facebook/AuthenticationTokenClaims;", "getClaims", "()Lcom/facebook/AuthenticationTokenClaims;", "claims", InneractiveMediationDefs.GENDER_FEMALE, "getSignature", InAppPurchaseMetaData.KEY_SIGNATURE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "parcel", "(Landroid/os/Parcel;)V", "jsonObject", "(Lorg/json/JSONObject;)V", "g", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class AuthenticationToken implements Parcelable {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final String token;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final String expectedNonce;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final AuthenticationTokenHeader header;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final AuthenticationTokenClaims claims;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final String signature;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<AuthenticationToken> CREATOR = new a();

    /* JADX INFO: compiled from: AuthenticationToken.kt */
    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/facebook/AuthenticationToken$a", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/AuthenticationToken;", "Landroid/os/Parcel;", "source", "a", "", "size", "", "b", "(I)[Lcom/facebook/AuthenticationToken;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class a implements Parcelable.Creator<AuthenticationToken> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AuthenticationToken createFromParcel(Parcel source) {
            p.j(source, "source");
            return new AuthenticationToken(source);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AuthenticationToken[] newArray(int size) {
            return new AuthenticationToken[size];
        }
    }

    /* JADX INFO: renamed from: com.facebook.AuthenticationToken$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: AuthenticationToken.kt */
    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\bR\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\bR\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\bR\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/facebook/AuthenticationToken$b;", "", "Lcom/facebook/AuthenticationToken;", "authenticationToken", "Lmj/r;", "a", "", "AUTHENTICATION_TOKEN_KEY", "Ljava/lang/String;", "CLAIMS_KEY", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "EXPECTED_NONCE_KEY", "HEADER_KEY", "SIGNATURE_KEY", "TOKEN_STRING_KEY", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final void a(AuthenticationToken authenticationToken) {
            AuthenticationTokenManager.INSTANCE.a().e(authenticationToken);
        }
    }

    public AuthenticationToken(String str, String str2) {
        p.j(str, "token");
        p.j(str2, "expectedNonce");
        k0.h(str, "token");
        k0.h(str2, "expectedNonce");
        List listN0 = a0.N0(str, new String[]{"."}, false, 0, 6, null);
        if (!(listN0.size() == 3)) {
            throw new IllegalArgumentException("Invalid IdToken string".toString());
        }
        String str3 = (String) listN0.get(0);
        String str4 = (String) listN0.get(1);
        String str5 = (String) listN0.get(2);
        this.token = str;
        this.expectedNonce = str2;
        AuthenticationTokenHeader authenticationTokenHeader = new AuthenticationTokenHeader(str3);
        this.header = authenticationTokenHeader;
        this.claims = new AuthenticationTokenClaims(str4, str2);
        if (!a(str3, str4, str5, authenticationTokenHeader.getKid())) {
            throw new IllegalArgumentException("Invalid Signature".toString());
        }
        this.signature = str5;
    }

    public final boolean a(String headerString, String claimsString, String sigString, String kid) {
        try {
            String strC = c.c(kid);
            if (strC == null) {
                return false;
            }
            return c.e(c.b(strC), headerString + '.' + claimsString, sigString);
        } catch (IOException | InvalidKeySpecException unused) {
            return false;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthenticationToken)) {
            return false;
        }
        AuthenticationToken authenticationToken = (AuthenticationToken) other;
        return p.e(this.token, authenticationToken.token) && p.e(this.expectedNonce, authenticationToken.expectedNonce) && p.e(this.header, authenticationToken.header) && p.e(this.claims, authenticationToken.claims) && p.e(this.signature, authenticationToken.signature);
    }

    public final JSONObject c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token_string", this.token);
        jSONObject.put("expected_nonce", this.expectedNonce);
        jSONObject.put("header", this.header.e());
        jSONObject.put("claims", this.claims.c());
        jSONObject.put(InAppPurchaseMetaData.KEY_SIGNATURE, this.signature);
        return jSONObject;
    }

    public int hashCode() {
        return ((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.token.hashCode()) * 31) + this.expectedNonce.hashCode()) * 31) + this.header.hashCode()) * 31) + this.claims.hashCode()) * 31) + this.signature.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.j(parcel, "dest");
        parcel.writeString(this.token);
        parcel.writeString(this.expectedNonce);
        parcel.writeParcelable(this.header, i10);
        parcel.writeParcelable(this.claims, i10);
        parcel.writeString(this.signature);
    }

    public AuthenticationToken(Parcel parcel) {
        p.j(parcel, "parcel");
        this.token = k0.l(parcel.readString(), "token");
        this.expectedNonce = k0.l(parcel.readString(), "expectedNonce");
        Parcelable parcelable = parcel.readParcelable(AuthenticationTokenHeader.class.getClassLoader());
        if (parcelable != null) {
            this.header = (AuthenticationTokenHeader) parcelable;
            Parcelable parcelable2 = parcel.readParcelable(AuthenticationTokenClaims.class.getClassLoader());
            if (parcelable2 != null) {
                this.claims = (AuthenticationTokenClaims) parcelable2;
                this.signature = k0.l(parcel.readString(), InAppPurchaseMetaData.KEY_SIGNATURE);
                return;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public AuthenticationToken(JSONObject jSONObject) throws JSONException {
        p.j(jSONObject, "jsonObject");
        String string = jSONObject.getString("token_string");
        p.i(string, "jsonObject.getString(TOKEN_STRING_KEY)");
        this.token = string;
        String string2 = jSONObject.getString("expected_nonce");
        p.i(string2, "jsonObject.getString(EXPECTED_NONCE_KEY)");
        this.expectedNonce = string2;
        String string3 = jSONObject.getString(InAppPurchaseMetaData.KEY_SIGNATURE);
        p.i(string3, "jsonObject.getString(SIGNATURE_KEY)");
        this.signature = string3;
        JSONObject jSONObject2 = jSONObject.getJSONObject("header");
        JSONObject jSONObject3 = jSONObject.getJSONObject("claims");
        p.i(jSONObject2, "headerJSONObject");
        this.header = new AuthenticationTokenHeader(jSONObject2);
        AuthenticationTokenClaims.Companion companion = AuthenticationTokenClaims.INSTANCE;
        p.i(jSONObject3, "claimsJSONObject");
        this.claims = companion.a(jSONObject3);
    }
}
