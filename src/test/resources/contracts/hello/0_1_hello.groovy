import org.springframework.cloud.contract.spec.Contract
import org.springframework.http.HttpMethod

Contract.make {
    description "Get Hello Success"
    request {
        url "/hello"
        method HttpMethod.GET.toString()
        headers {
            contentType(applicationJson())
        }
    }
    response {
        status OK()
        body("""hello""")
    }
}
