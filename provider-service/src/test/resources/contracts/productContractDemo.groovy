import org.springframework.cloud.contract.spec.Contract

Contract.make {
    //ignored()
    request {
        method 'GET'
        urlPath('/product') {
            queryParameters {
                parameter('id', 537)
            }
        }
    }
    response {
        status 200
        body(
                '''
                {
                  "description": "Consumer Test verifies provider",
                  "name": "Consumer Test",
                  "type": "testing product"
                }
                '''
        )
        headers {
            header('Content-Type', 'application/json;charset=UTF-8')
        }
    }
}