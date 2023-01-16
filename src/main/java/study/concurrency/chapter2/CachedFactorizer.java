package study.concurrency.chapter2;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigInteger;

public class CachedFactorizer extends HttpServlet {
    private BigInteger lastNumber;
    private BigInteger[] lastFactors;
    private Long hits;
    private Long cacheHits;

    @Override
    protected synchronized void service(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        BigInteger i = extractFromRequest(req);
        BigInteger[] factors = null;

        synchronized (this) {
            ++hits;
            if (i.equals(lastNumber)) {
                ++cacheHits;
                factors = lastFactors.clone();
            }
        }

        if (factors == null) {
            factors = factor(i);
            synchronized (this) {
                lastNumber = i;
                lastFactors = factors.clone();
            }
        }
        encodeIntoResponse(resp, factors);
    }

    private BigInteger[] factor(BigInteger i) {
        return new BigInteger[0];
    }

    private void encodeIntoResponse(HttpServletResponse resp, BigInteger[] lastFactors) {

    }

    private BigInteger extractFromRequest(HttpServletRequest req) {
        return null;
    }
}
