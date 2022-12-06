<template>
  <div>
    <HeadersComp></HeadersComp>
    <TableForm></TableForm>
    <CopyRight></CopyRight>
  </div>
</template>

<script>
import CopyRight from "../components/CopyRight.vue"
import HeadersComp from "../components/Header.vue"
import TableForm from "../components/TableForm.vue"
export default {
    name:"AddPage",
    components:{
        CopyRight,
        HeadersComp,
        TableForm

    }

}
</script>

<style>

</style>