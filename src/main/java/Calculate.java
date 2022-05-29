import java.math.BigDecimal;

public interface Calculate {

    public BigDecimal monthPay(BigDecimal years, BigDecimal sum, BigDecimal precent);

    public BigDecimal allSum(BigDecimal years, BigDecimal sum, BigDecimal precent);

    public BigDecimal overPay(BigDecimal years, BigDecimal sum, BigDecimal precent);
}
