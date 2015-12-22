package demo

class DemoController {

    def index() {
        render view: '/foo/foo', model: [:]
    }
}
