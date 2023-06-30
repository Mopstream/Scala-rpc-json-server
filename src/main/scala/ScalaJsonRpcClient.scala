import java.net.URL
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.node.ObjectNode
import com.googlecode.jsonrpc4j.JsonRpcHttpClient
import com.github.dwickern.macros.NameOf._

object ScalaJsonRpcClient {
  def main(args: Array[String]): Unit = {
    val mapper = new ObjectMapper()
    val jsonRpcHttpClient = new JsonRpcHttpClient(new URL("http://localhost:1337/json-rpc"))

    val requestNode: ObjectNode = mapper.createObjectNode()

    val left = 1400
    val right = 88

    // construct rpc body
    //requestNode.putObject("expression").put(nameOf(left), left).put(nameOf(right), right)

    val responseNode = jsonRpcHttpClient.invoke("test", requestNode, classOf[Unit])

    //println(s"Result: $responseNode")

    //assert(left + right == responseNode)
  }
}