package debtorItem;

import com.trex.cashcol.GetDebtorItemRequest;
import com.trex.cashcol.GetDebtorItemResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.xml.datatype.DatatypeConfigurationException;

@Endpoint
public class DebtorItemEndpoint {
    private static final String NAMESPACE_URI = "http://trex.com/cashcol";

    private DebtorItemRepository debtorItemRepository;

    @Autowired
    public DebtorItemEndpoint(DebtorItemRepository debtorItemRepository) {
        this.debtorItemRepository = debtorItemRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getDebtorItemRequest")
    @ResponsePayload
    public GetDebtorItemResponse getDebtorItem(@RequestPayload GetDebtorItemRequest request) throws DatatypeConfigurationException {
        GetDebtorItemResponse response = new GetDebtorItemResponse();
        response.getDebtorItem().addAll(debtorItemRepository.findDebtorItems(request.getCustomerID()));

        return response;
    }
}
