package routes

import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*

const val supplierBaseUrl: String = "/suppliers"

fun Application.registerSupplierRoutes() {
  routing {
    createSupplierRoute()
    listSuppliersRoute()
    getSupplierRoute()
    editSupplierRoute()
    trashSupplierRoute()
  }
}

fun Route.createSupplierRoute() {
  post(supplierBaseUrl) {
    call.respondText("Creating supplier", status = HttpStatusCode.Created)
  }
}

fun Route.listSuppliersRoute() {
  get(supplierBaseUrl) {
    call.respondText("Getting suppliers", status = HttpStatusCode.OK)
  }
}

fun Route.getSupplierRoute() {
  get("$supplierBaseUrl/{id}") {
    val id = call.parameters["id"] ?: return@get call.respondText("Bad Request", status = HttpStatusCode.BadRequest)
    call.respondText("Getting supplier id: $id", status = HttpStatusCode.OK)
  }
}

fun Route.editSupplierRoute() {
  patch("$supplierBaseUrl/{id}") {
    val id = call.parameters["id"] ?: return@patch call.respondText("Bad Request", status = HttpStatusCode.BadRequest)
    call.respondText("Editing supplier id: $id", status = HttpStatusCode.Accepted)
  }
}

fun Route.trashSupplierRoute() {
  delete("$supplierBaseUrl/{id}") {
    val id = call.parameters["id"] ?: return@delete call.respondText("Bad Request", status = HttpStatusCode.BadRequest)
    call.respondText("Deleting supplier id: $id", status = HttpStatusCode.Accepted)
  }
}
