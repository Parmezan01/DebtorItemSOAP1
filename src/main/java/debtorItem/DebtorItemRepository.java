package debtorItem;

import com.trex.cashcol.DebtorItem;
import org.springframework.stereotype.Component;


import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class DebtorItemRepository {

    public List<DebtorItem> findDebtorItems(String customerID) throws DatatypeConfigurationException {
        List<DebtorItem> toReturn = new ArrayList<>();
        for (int i = 0; i < createRandomIntBetween(1, 10); i++) {
            DebtorItem temp = new DebtorItem();
            temp.setAmount(BigDecimal.valueOf(createRandomIntBetween(100, 100000)).movePointLeft(2));
            temp.setCustomerID(customerID);
            temp.setReferenceNumber(createRandomIntBetween(1000, 100000000));
            temp.setDueDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(createRandomDate(2019, 2022).toString()));
            toReturn.add(temp);
        }
        return toReturn;
    }

    private static int createRandomIntBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }

    private static LocalDate createRandomDate(int startYear, int endYear) {
        int day = createRandomIntBetween(1, 28);
        int month = createRandomIntBetween(1, 12);
        int year = createRandomIntBetween(startYear, endYear);
        return LocalDate.of(year, month, day);
    }}
