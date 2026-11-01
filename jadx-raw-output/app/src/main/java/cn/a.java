package cn;

import java.net.Socket;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedKeyManager;
import javax.net.ssl.X509KeyManager;

/* JADX INFO: compiled from: AliasedX509ExtendedKeyManager.java */
/* JADX INFO: loaded from: classes9.dex */
public class a extends X509ExtendedKeyManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f6129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public X509KeyManager f6130b;

    @Override // javax.net.ssl.X509KeyManager
    public String chooseClientAlias(String[] strArr, Principal[] principalArr, Socket socket) {
        String str = this.f6129a;
        return str == null ? this.f6130b.chooseClientAlias(strArr, principalArr, socket) : str;
    }

    @Override // javax.net.ssl.X509ExtendedKeyManager
    public String chooseEngineClientAlias(String[] strArr, Principal[] principalArr, SSLEngine sSLEngine) {
        String str = this.f6129a;
        return str == null ? super.chooseEngineClientAlias(strArr, principalArr, sSLEngine) : str;
    }

    @Override // javax.net.ssl.X509ExtendedKeyManager
    public String chooseEngineServerAlias(String str, Principal[] principalArr, SSLEngine sSLEngine) {
        String str2 = this.f6129a;
        return str2 == null ? super.chooseEngineServerAlias(str, principalArr, sSLEngine) : str2;
    }

    @Override // javax.net.ssl.X509KeyManager
    public String chooseServerAlias(String str, Principal[] principalArr, Socket socket) {
        String str2 = this.f6129a;
        return str2 == null ? this.f6130b.chooseServerAlias(str, principalArr, socket) : str2;
    }

    @Override // javax.net.ssl.X509KeyManager
    public X509Certificate[] getCertificateChain(String str) {
        return this.f6130b.getCertificateChain(str);
    }

    @Override // javax.net.ssl.X509KeyManager
    public String[] getClientAliases(String str, Principal[] principalArr) {
        return this.f6130b.getClientAliases(str, principalArr);
    }

    @Override // javax.net.ssl.X509KeyManager
    public PrivateKey getPrivateKey(String str) {
        return this.f6130b.getPrivateKey(str);
    }

    @Override // javax.net.ssl.X509KeyManager
    public String[] getServerAliases(String str, Principal[] principalArr) {
        return this.f6130b.getServerAliases(str, principalArr);
    }

    public a(String str, X509KeyManager x509KeyManager) throws Exception {
        this.f6129a = str;
        this.f6130b = x509KeyManager;
    }
}
