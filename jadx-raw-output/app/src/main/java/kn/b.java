package kn;

import java.util.Locale;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.fourthline.cling.binding.xml.DescriptorBindingException;
import org.fourthline.cling.model.ValidationException;
import org.seamless.xml.ParserException;
import org.xml.sax.SAXParseException;

/* JADX INFO: compiled from: RecoveringUDA10DeviceDescriptorBinderImpl.java */
/* JADX INFO: loaded from: classes7.dex */
public class b extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Logger f62948b = Logger.getLogger(b.class.getName());

    /* JADX WARN: Code duplicated, block: B:21:0x0081  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ed A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:23:0x0085
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.processExcHandler(ExcHandlersRegionMaker.java:154)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:77)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // kn.d, kn.a
    public <D extends un.a> D a(D r8, java.lang.String r9) throws org.fourthline.cling.binding.xml.DescriptorBindingException, org.fourthline.cling.model.ValidationException {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kn.b.a(un.a, java.lang.String):un.a");
    }

    public final String s(String str) {
        int iIndexOf = str.indexOf("<?xml");
        return iIndexOf == -1 ? str : str.substring(iIndexOf);
    }

    public String t(String str, DescriptorBindingException descriptorBindingException) {
        int iIndexOf = str.indexOf("</root>");
        if (iIndexOf == -1) {
            f62948b.warning("No closing </root> element in descriptor");
            return null;
        }
        if (str.length() == iIndexOf + 7) {
            return null;
        }
        f62948b.warning("Detected garbage characters after <root> node, removing");
        return str.substring(0, iIndexOf) + "</root>";
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0044 A[PHI: r0
  0x0044: PHI (r0v7 java.util.regex.Matcher) = (r0v6 java.util.regex.Matcher), (r0v3 java.util.regex.Matcher) binds: [B:17:0x0040, B:13:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Instruction removed from duplicated block: B:19:0x0044, please report this as an issue */
    public String u(String str, DescriptorBindingException descriptorBindingException) {
        String message;
        Matcher matcher;
        Throwable cause = descriptorBindingException.getCause();
        if ((!(cause instanceof SAXParseException) && !(cause instanceof ParserException)) || (message = cause.getMessage()) == null) {
            return null;
        }
        Matcher matcher2 = Pattern.compile("The prefix \"(.*)\" for element").matcher(message);
        if (!matcher2.find() || matcher2.groupCount() != 1) {
            matcher2 = Pattern.compile("undefined prefix: ([^ ]*)").matcher(message);
            if (matcher2.find() && matcher2.groupCount() == 1) {
                String strGroup = matcher2.group(1);
                f62948b.warning("Fixing missing namespace declaration for: " + strGroup);
                matcher = Pattern.compile("<root([^>]*)").matcher(str);
                if (!matcher.find() && matcher.groupCount() == 1) {
                    String strGroup2 = matcher.group(1);
                    f62948b.fine("Preserving existing <root> element attributes/namespace declarations: " + matcher.group(0));
                    Matcher matcher3 = Pattern.compile("<root[^>]*>(.*)</root>", 32).matcher(str);
                    if (matcher3.find() && matcher3.groupCount() == 1) {
                        return "<?xml version=\"1.0\" encoding=\"UTF-8\" ?><root " + String.format(Locale.ROOT, "xmlns:%s=\"urn:schemas-dlna-org:device-1-0\"", strGroup) + strGroup2 + ">" + matcher3.group(1) + "</root>";
                    }
                    f62948b.fine("Could not extract body of <root> element");
                    return null;
                }
                f62948b.fine("Could not find <root> element attributes");
            }
        } else {
            String strGroup3 = matcher2.group(1);
            f62948b.warning("Fixing missing namespace declaration for: " + strGroup3);
            matcher = Pattern.compile("<root([^>]*)").matcher(str);
            if (!matcher.find()) {
            }
            f62948b.fine("Could not find <root> element attributes");
        }
        return null;
    }

    public void v(String str, DescriptorBindingException descriptorBindingException) throws DescriptorBindingException {
        throw descriptorBindingException;
    }

    public <D extends un.a> D w(String str, D d10, ValidationException validationException) throws ValidationException {
        throw validationException;
    }
}
