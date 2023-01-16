package study.concurrency.chapter2;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigInteger;

public class SynchronizedFactorizer extends HttpServlet {
    private BigInteger lastNumber;
    private BigInteger[] lastFactors;

    @Override
    protected synchronized void service(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        BigInteger i = extractFromRequest(req);
        if (i.equals(lastNumber)) {
            encodeIntoResponse(resp, lastFactors);
        } else {
            BigInteger[] factors = factor(i);
            lastNumber = i;
            lastFactors = factors;
            encodeIntoResponse(resp, factors);
        }
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
