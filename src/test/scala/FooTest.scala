import org.scalatest.path

class FooTest extends path.FunSpec {

  describe("A Foo") {

    it("does something awesome") {
      assert("Bar" === Foo.doSomethingAwesome())
    }
  }
}
