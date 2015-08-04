import org.scalatest._

class FooTest extends FunSpec {

  describe("A Foo") {

    it("does something awesome") {
      assert("Bar" == Foo.doSomethingAwesome())
    }
  }
}
