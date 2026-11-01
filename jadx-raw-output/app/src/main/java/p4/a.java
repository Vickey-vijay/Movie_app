package p4;

import android.net.Uri;
import androidx.annotation.Nullable;
import e5.q;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: Aes128DataSource.java */
/* JADX INFO: loaded from: classes7.dex */
public class a implements com.google.android.exoplayer2.upstream.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.a f65882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f65883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f65884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public CipherInputStream f65885d;

    @Override // com.google.android.exoplayer2.upstream.a
    public final void b(q qVar) {
        this.f65882a.b(qVar);
    }

    public Cipher c() throws NoSuchPaddingException, NoSuchAlgorithmException {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void close() throws IOException {
        if (this.f65885d != null) {
            this.f65885d = null;
            this.f65882a.close();
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public final Map<String, List<String>> getResponseHeaders() {
        return this.f65882a.getResponseHeaders();
    }

    @Override // com.google.android.exoplayer2.upstream.a
    @Nullable
    public final Uri getUri() {
        return this.f65882a.getUri();
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        g5.a.e(this.f65885d);
        int i12 = this.f65885d.read(bArr, i10, i11);
        if (i12 < 0) {
            return -1;
        }
        return i12;
    }

    public a(com.google.android.exoplayer2.upstream.a aVar, byte[] bArr, byte[] bArr2) {
        this.f65882a = aVar;
        this.f65883b = bArr;
        this.f65884c = bArr2;
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public final long a(e5.h hVar) throws IOException {
        try {
            Cipher cipherC = c();
            try {
                cipherC.init(2, new SecretKeySpec(this.f65883b, "AES"), new IvParameterSpec(this.f65884c));
                e5.g gVar = new e5.g(this.f65882a, hVar);
                this.f65885d = new CipherInputStream(gVar, cipherC);
                gVar.h();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e10) {
                throw new RuntimeException(e10);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e11) {
            throw new RuntimeException(e11);
        }
    }
}
