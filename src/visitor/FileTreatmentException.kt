package visitor

import java.lang.RuntimeException

class FileTreatmentException: RuntimeException {
    constructor()
    constructor(msg: String): super(msg)
}